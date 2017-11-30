$(function() {

	//初始化请求地址
	var findAllLogUrl = "http://localhost:8888/dpms/log/findAll";

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
		if(target == "#area") {

		} else if(target == "#ageRange") {

		} else if(target == "#lastName") {

		} else if(target == "#nation") {

		} else if(target == "#profession") {

		} else if(target == "#user") {

		} else if(target == "#statistics") {

		} else if(target == "#log") {
			url = findAllLogUrl;
		}
		ajax_("get", findAllLogUrl, {}, function(data) {
			if(data.request) {
				var $table = $('<table class="table table-hover table-responsive text-center"></table>');
				var $thead = $('<thead><th class="text-center">序号</th><th class="text-center">请求时间</th><th class="text-center">请求地址</th><th class="text-center">请求方法</th><th class="text-center">请求参数</th><th class="text-center">返回内容</th><th class="text-center">耗时</th></thead>');
				var $tbody = $('<tbody></tbody>');
				for(var i = 1; i < data.data.length; i++) {
					$($tbody).append($('<tr>' +
						'<td logCode="' + data.data[i - 1].log_code + '">' + i + '</td>' +
						'<td>' + data.data[i - 1].log_date_time + '</td>' +
						'<td>' + data.data[i - 1].request_uri + '</td>' +
						'<td>' + data.data[i - 1].request_method + '</td>' +
						'<td>' + data.data[i - 1].request_param + '</td>' +
						'<td>' + data.data[i - 1].response_content + '</td>' +
						'<td>' + data.data[i - 1].spend_time + '</td>' +
						'</tr>'));
				}
				$table.append($thead);
				$table.append($tbody);
				//显示loading
				$(".loading").css("display", "none");
				$(target).append($table);
			} else {
				alert(data.message);
			}
		});
	});

})