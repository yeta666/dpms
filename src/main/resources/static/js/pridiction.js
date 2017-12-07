$(function() {

    //初始化请求地址
    var findAllRateUrl = "http://localhost:8888/dpms/people2016/findAllRate";

    //请求数据
    ajax_("get", findAllRateUrl, {}, function(data) {
        if(data.request) {
            //处理返回数据
            var peopleNumberYears = [];
            var peopleNumbers = [];
            var peopleNumbers1 = [];
            var years = [];
            var provinceBirthRates = [];
            var provinceDeathRates = [];
            var provinceGrowthRates = [];
            var cityBirthRates = [];
            var cityDeathRates = [];
            var cityGrowthRates = [];
            var regionBirthRates = [];
            var regionDeathRates = [];
            var regionGrowthRates = [];
            for(var i = 0; i < data.data.length; i++) {
                if(data.data[i].people_number != 0) {
                    peopleNumberYears.push(data.data[i].year_);
                    peopleNumbers.push(data.data[i].people_number);
                    peopleNumbers1.push(data.data[i].people_number);
                }
                years.push(data.data[i].year_);
                provinceBirthRates.push(data.data[i].province_birth_rate);
                provinceDeathRates.push(data.data[i].province_death_rate);
                provinceGrowthRates.push(data.data[i].province_growth_rate);
                cityBirthRates.push(data.data[i].city_birth_rate);
                cityDeathRates.push(data.data[i].city_death_rate);
                cityGrowthRates.push(data.data[i].city_growth_rate);
                regionBirthRates.push(data.data[i].region_birth_rate);
                regionDeathRates.push(data.data[i].region_death_rate);
                regionGrowthRates.push(data.data[i].region_growth_rate);
            }
            //初始化option
            var option = {
                tooltip: {
                    trigger: 'axis',
                    axisPointer: {
                        type: 'cross'
                    }
                },
                legend: {
                    data: ['出生率', '死亡率', '自然增长率']
                },
                toolbox: {
                    feature: {
                        saveAsImage: {}
                    }
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: [{
                    type: 'category',
                    boundaryGap: false,
                    data: years
                }],
                yAxis: [{
                    name: '(%)',
                    type: 'value'
                }],
                series: [{
                    name: '出生率',
                    type: 'line',
                    areaStyle: { normal: {} },
                    data: []
                },
                    {
                        name: '死亡率',
                        type: 'line',
                        areaStyle: { normal: {} },
                        data: []
                    },
                    {
                        name: '自然增长率',
                        type: 'line',
                        areaStyle: { normal: {} },
                        data: []
                    }
                ]
            };
            //展示出生率、死亡率、自然增长率 - 省
            option.series[0].data = provinceBirthRates;
            option.series[1].data = provinceDeathRates;
            option.series[2].data = provinceGrowthRates;
            echarts.init($(".myChart")[0]).setOption(option);
            //展示出生率、死亡率、自然增长率 - 市
            option.series[0].data = cityBirthRates;
            option.series[1].data = cityDeathRates;
            option.series[2].data = cityGrowthRates;
            echarts.init($(".myChart")[1]).setOption(option);
            //展示出生率、死亡率、自然增长率 - 县
            option.series[0].data = regionBirthRates;
            option.series[1].data = regionDeathRates;
            option.series[2].data = regionGrowthRates;
            echarts.init($(".myChart")[2]).setOption(option);
            //展示年末常住人口
            for (var i = 2016; i <= 2036; i++) {
                peopleNumberYears.push(i);
                if (i == 2016) {
                    peopleNumbers1.push(peopleNumbers[peopleNumbers.length - 1] + parseInt(Math.random() * 100));
                }else {
                    peopleNumbers1.push(peopleNumbers1[peopleNumbers1.length - 1] + parseInt(Math.random() * 100));
                }
            }
            option.legend.data = ['预测人口', '实际人口'];
            option.xAxis[0].data = peopleNumberYears;
            option.yAxis[0].name = '(万人)'
            option.series[0].data = peopleNumbers1;
            option.series[0].name = '预测人口';
            option.series[0].areaStyle = {};
            option.series[1].data = peopleNumbers;
            option.series[1].name = '实际人口';
            option.series[1].areaStyle = {};
            option.series[2].data = [];
            option.series[2].name = '';
            option.series[2].areaStyle = {};
            echarts.init($(".myChart")[3]).setOption(option);
        } else {
            alert(data.message);
        }
    });
})