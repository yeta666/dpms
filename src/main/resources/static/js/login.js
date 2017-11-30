$(function() {
	
	//初始化请求地址
	var loginUrl = "http://localhost:8888/dpms/user/login";
	
	//点击登录按钮
	$("#loginBtn").click(function() {
		//检验用户名密码是否为空
		var username = $("#username").val().trim();
		var password = $("#password").val().trim();
		if(username != "" && password != "") {
			ajax_("get", loginUrl, {
				"username": username,
				"password": password
			}, function(data) {
				if (data.request) {
					window.location.href = "dashboard.html?username=" + data.data.username_ + "&role=" + data.data.role_;
				}else {
					alert(data.message);
				}
			});
		} else {
			alert("请填写用户名或密码！");
		}
	});
})