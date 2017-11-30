$(function() {

	//各种请求地址初始化
	var findAllProvinceUrl = "http://localhost:8888/dpms/province/findAll";
	var findAllCityByProvinceCodeUrl = "http://localhost:8888/dpms/city/findAllByProvinceCode";
	var findAllRegionByCityCodeUrl = "http://localhost:8888/dpms/region/findAllByCityCode";
	var findCountByAreaCodeUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCode";
	var findCountByAreaCodeGroupByGenderUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCodeGroupByGender";
	var findCountByAreaCodeGroupByAgeRangeUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCodeGroupByAgeRange";
	var findCountByAreaCodeGroupByNationUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCodeGroupByNation";
	var findCountByAreaCodeGroupByLastNameUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCodeGroupByLastName";
	var findCountByAreaCodeGroupByProfessionUrl = "http://localhost:8888/dpms/people2016/findCountByAreaCodeGroupByProfession";

	//select改变时，把数据同步到显示的button中
	$(".menuUl select").change(function() {
		$(this).parent().prev().children()[0].innerHTML = $(this).val();
		//所有展示清空
		$("#myTabs li").removeClass("active");
		$(".displayBox div").removeClass("active");
		$(".displayBox").html('<div role="tabpanel" class="tab-pane fade in" id="totalPeopleNum"></div>' +
			'<div role="tabpanel" class="tab-pane fade in" id="gender"></div>' +
			'<div role="tabpanel" class="tab-pane fade in" id="ageRange"></div>' +
			'<div role="tabpanel" class="tab-pane fade in" id="nation"></div>' +
			'<div role="tabpanel" class="tab-pane fade in" id="lastName"></div>' +
			'<div role="tabpanel" class="tab-pane fade in" id="profession"></div>');
	});

	//加载省
	ajax_(
		"get",
		findAllProvinceUrl, {},
		function(data) {
			if(data.request) {
				var pArr = data.data;
				//加载数据到menuUl中
				for(var i = 0; i < pArr.length; i++) {
					$($(".menuUl")[0]).children().append($('<option pCode="' + pArr[i].province_code + '">' + pArr[i].province_ + '</option>').click(function() {
						//清空原市select里面显示的数据
						$($(".menuUl")[1]).children().html("");
						//清空原市显示的数据
						$($("#cityMenu span")[0]).attr("cCode", null);
						$($("#cityMenu span")[0]).html("请选择市/自治州");
						//加载省码
						$($("#provinceMenu span")[0]).attr("pCode", $(this).attr("pCode"));
						//请求该省的市数据
						ajax_("get",
							findAllCityByProvinceCodeUrl, { "provinceCode": $(this).attr("pCode") },
							function(data) {
								if(data.request) {
									var cArr = data.data;
									//加载数据到menuUl中
									for(var i = 0; i < cArr.length; i++) {
										$($(".menuUl")[1]).children().append($('<option cCode="' + cArr[i].city_code + '">' + cArr[i].city_ + '</option>').click(function() {
											//清空原区select里面显示的数据
											$($(".menuUl")[2]).children().html("");
											//清空原区显示的数据
											$($("#regionMenu span")[0]).attr("rCode", null);
											$($("#regionMenu span")[0]).html("请选择区/县级市/县");
											//加载市码
											$($("#cityMenu span")[0]).attr("cCode", $(this).attr("cCode"));
											//获取该市的区数据
											ajax_("get",
												findAllRegionByCityCodeUrl, { "cityCode": $(this).attr("cCode") },
												function(data) {
													if(data.request) {
														var rArr = data.data;
														//加载数据到menuUl中
														for(var i = 0; i < rArr.length; i++) {
															$($(".menuUl")[2]).children().append($('<option rCode="' + rArr[i].region_code + '">' + rArr[i].region_ + '</option>').click(function() {
																//加载区码
																$($("#regionMenu span")[0]).attr("rCode", $(this).attr("rCode"));
															}));
														}
													} else {
														alert(data.message);
													}
												}
											);
											//显示区
											$(".regionBox").css("visibility", "visible");
										}));
									}
								} else {
									alert(data.message);
								}
							}
						);
						//显示市
						$(".cityBox").css("visibility", "visible");
					}));
				}
			} else {
				alert(data.message);
			}
		}
	);

	//展示
	$('#myTabs a').click(function() {
		//获取展示目标
		var target = $(this).attr("href");
		//判断是否之前已经展示过
		if($(target).children().length != 0) {
			return;
		}
		//显示loading
		$(".loading").css("display", "block");
		//初始化查询url
		var url;
		//判断当前切换到哪个类型进行展示，以确定请求数据地址
		if(target == "#totalPeopleNum") {
			url = findCountByAreaCodeUrl;
		} else if(target == "#gender") {
			url = findCountByAreaCodeGroupByGenderUrl;
		} else if(target == "#ageRange") {
			url = findCountByAreaCodeGroupByAgeRangeUrl;
		} else if(target == "#nation") {
			url = findCountByAreaCodeGroupByNationUrl;
		} else if(target == "#lastName") {
			url = findCountByAreaCodeGroupByLastNameUrl;
		} else if(target == "#profession") {
			url = findCountByAreaCodeGroupByProfessionUrl;
		}
		//初始化查询参数
		var data;
		//判断区域选择情况
		var pCode = $($("#provinceMenu span")[0]).attr("pCode");
		var cCode = $($("#cityMenu span")[0]).attr("cCode");
		var rCode = $($("#regionMenu span")[0]).attr("rCode");
		if(pCode != undefined) {
			//选择了省
			if(cCode != undefined) {
				//选择了市
				if(rCode != undefined) {
					//选择了区
					data = { "regionCode": rCode };
				} else {
					//没选择区
					data = { "cityCode": cCode };
				}
			} else {
				//没选择市
				data = { "provinceCode": pCode };
			}
			//没选择省
		} else {
			alert("请选择区域！");
			return;
		}
		//请求数据
		ajax_("get", url, data,
			function(data) {
				console.log(data);
				if(data.request) {
					//根据展示类型设置图表参数
					var option;
					if(target == "#totalPeopleNum") {
						option = {
							tooltip: {
								trigger: 'item',
								formatter: "{a} <br/>{b}: {c} ({d}%)"
							},
							legend: {
								orient: 'vertical',
								x: 'left',
								data: ['总人口']
							},
							toolbox: {
								show: true,
								feature: {
									mark: { show: true },
									dataView: { show: true, readOnly: false },
									magicType: {
										show: true,
										type: ['pie', 'funnel']
									},
									restore: { show: true },
									saveAsImage: { show: true }
								}
							},
							series: [{
								name: '总人口',
								type: 'pie',
								radius: ['50%', '70%'],
								avoidLabelOverlap: false,
								label: {
									normal: {
										show: false,
										position: 'center'
									},
									emphasis: {
										show: true,
										textStyle: {
											fontSize: '30',
											fontWeight: 'bold'
										}
									}
								},
								labelLine: {
									normal: {
										show: false
									}
								},
								data: [
									{ value: data.data, name: '总人口' }
								]
							}]
						};
					} else if(target == "#gender") {
						//返回数据分析
						var menNum, womenNum;
						for(var i = 0; i < data.data.length; i++) {
							if(data.data[i].gender_ == 0) {
								womenNum = data.data[i].count_;
							} else if(data.data[i].gender_ == 1) {
								menNum = data.data[i].count_;
							}
						}
						option = {
							tooltip: {
								trigger: 'item',
								formatter: "{a} <br/>{b} : {c} ({d}%)"
							},
							legend: {
								orient: 'vertical',
								left: 'left',
								data: ['男性人口', '女性人口']
							},
							toolbox: {
								show: true,
								feature: {
									mark: { show: true },
									dataView: { show: true, readOnly: false },
									magicType: {
										show: true,
										type: ['pie', 'funnel']
									},
									restore: { show: true },
									saveAsImage: { show: true }
								}
							},
							series: [{
								name: '性别',
								type: 'pie',
								radius: '60%',
								center: ['50%', '50%'],
								data: [
									{ value: womenNum, name: '女性人口' },
									{ value: menNum, name: '男性人口' }
								],
								itemStyle: {
									emphasis: {
										shadowBlur: 10,
										shadowOffsetX: 0,
										shadowColor: 'rgba(0, 0, 0, 0.5)'
									}
								}
							}]
						};
					} else if(target == "#ageRange") {
						//返回数据分析
						var ageRange = [];
						var ageRangeNums = [];
						for(var i = 0; i < data.data.length; i++) {
							var ar;
							if(i == data.data.length - 1) {
								ar = data.data[i].bottom_ + "岁及以上人口"
							} else {
								ar = data.data[i].bottom_ + "-" + data.data[i].top_ + "岁人口";
							}
							ageRange.push(ar);
							var ageRangeNum = {
								value: data.data[i].count_,
								name: ar
							}
							ageRangeNums.push(ageRangeNum);
						}
						option = {
							tooltip: {
								trigger: 'item',
								formatter: "{a} <br/>{b} : {c} ({d}%)"
							},
							legend: {
								orient: 'vertical',
								left: 'left',
								data: ageRange
							},
							toolbox: {
								show: true,
								feature: {
									mark: { show: true },
									dataView: { show: true, readOnly: false },
									magicType: {
										show: true,
										type: ['pie', 'funnel']
									},
									restore: { show: true },
									saveAsImage: { show: true }
								}
							},
							calculable: true,
							series: [{
								name: '年龄段',
								type: 'pie',
								radius: [30, 210],
								center: ['50%', '50%'],
								roseType: 'area',
								data: ageRangeNums
							}]
						};
					} else if(target == "#nation") {
						//返回数据分析
						var nations = [];
						var counts = [];
						for(var i = 0; i < data.data.length; i++) {
							nations.push(data.data[i].nation_);
							counts.push(data.data[i].count_)
						}
						option = {
							tooltip: {
								trigger: 'axis',
								axisPointer: {
									type: 'shadow',
									label: {
										show: true
									}
								}
							},
							toolbox: {
								show: true,
								feature: {
									mark: { show: true },
									dataView: { show: true, readOnly: false },
									magicType: { show: true, type: ['line', 'bar'] },
									restore: { show: true },
									saveAsImage: { show: true }
								}
							},
							calculable: true,
							legend: {
								orient: 'vertical',
								left: 'left',
								data: ['Growth', '民族'],
								itemGap: 5
							},
							grid: {
								top: '12%',
								left: '1%',
								right: '10%',
								containLabel: true
							},
							xAxis: [{
								type: 'category',
								data: nations
							}],
							yAxis: [{
								type: 'value',
								name: '（人）',
								axisLabel: {
									formatter: function(a) {
										a = +a;
										return isFinite(a) ?
											echarts.format.addCommas(+a) :
											'';
									}
								}
							}],
							dataZoom: [{
									show: true,
									start: 0,
									end: 100
								},
								{
									type: 'inside',
									start: 0,
									end: 100
								},
								{
									show: true,
									yAxisIndex: 0,
									filterMode: 'empty',
									width: 30,
									height: '80%',
									showDataShadow: false,
									left: '93%'
								}
							],
							series: [{
								name: '人口',
								type: 'bar',
								data: counts
							}]
						};
					} else if(target == "#lastName") {
						//返回数据分析
						var lastNames = [];
						var counts = [];
						for(var i = 0; i < data.data.length; i++) {
							lastNames.push(data.data[i].last_name);
							counts.push(data.data[i].count_);
						}
						option = {
							tooltip: {
								trigger: 'axis',
								position: function(pt) {
									return [pt[0], '10%'];
								}
							},
							toolbox: {
								feature: {
									dataZoom: {
										yAxisIndex: 'none'
									},
									restore: {},
									saveAsImage: {}
								}
							},
							xAxis: {
								type: 'category',
								boundaryGap: false,
								data: lastNames
							},
							yAxis: {
								type: 'value',
								boundaryGap: [0, '100%']
							},
							dataZoom: [{
								type: 'inside',
								start: 0,
								end: 100
							}, {
								start: 0,
								end: 100,
								handleIcon: 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',
								handleSize: '80%',
								handleStyle: {
									color: '#fff',
									shadowBlur: 3,
									shadowColor: 'rgba(0, 0, 0, 0.6)',
									shadowOffsetX: 2,
									shadowOffsetY: 2
								}
							}],
							series: [{
								name: '人口',
								type: 'line',
								smooth: true,
								symbol: 'none',
								sampling: 'average',
								itemStyle: {
									normal: {
										color: 'rgb(255, 70, 131)'
									}
								},
								areaStyle: {
									normal: {
										color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
											offset: 0,
											color: 'rgb(255, 158, 68)'
										}, {
											offset: 1,
											color: 'rgb(255, 70, 131)'
										}])
									}
								},
								data: counts
							}]
						};
					} else if(target == "#profession") {
						//返回数据分析
						var professions = [];
						var counts = [];
						for(var i = 1; i < data.data.length; i++) {
							professions.push(data.data[i].profession_);
							counts.push(data.data[i].count_);
						}
						option = {
							tooltip: {
								trigger: 'axis',
								axisPointer: {
									type: 'none'
								},
								formatter: function(params) {
									return params[0].name + ': ' + params[0].value;
								}
							},
							xAxis: {
								data: professions,
								axisTick: { show: false },
								axisLine: { show: false },
								axisLabel: {
									textStyle: {
										color: '#e54035'
									}
								}
							},
							yAxis: {
								splitLine: { show: false },
								axisTick: { show: false },
								axisLine: { show: false },
								axisLabel: { show: false }
							},
							color: ['#e54035'],
							series: [{
								name: 'hill',
								type: 'pictorialBar',
								barCategoryGap: '-130%',
								// symbol: 'path://M0,10 L10,10 L5,0 L0,10 z',
								symbol: 'path://M0,10 L10,10 C5.5,10 5.5,5 5,0 C4.5,5 4.5,10 0,10 z',
								itemStyle: {
									normal: {
										opacity: 0.5
									},
									emphasis: {
										opacity: 1
									}
								},
								data: counts,
								z: 10
							}]
						};
					}
					//关闭loading
					$(".loading").css("display", "none");
					//加载图表
					echarts.init($(target)[0]).setOption(option);
				} else {
					alert(data.message);
				}
			}
		);
	});
})