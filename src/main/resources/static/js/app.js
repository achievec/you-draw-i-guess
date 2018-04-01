var socket = new WebSocket("ws://localhost:8080/web-socket");
socket.onopen = function() {
    console.log("Socket 已打开");
    //socket.send("这是来自客户端的消息" + location.href + new Date());
};
socket.onmessage = function(msg) {
    console.log(msg.data);
};
socket.onclose = function() {
    console.log("Socket已关闭");
};
socket.onerror = function() {
    alert("Socket发生了错误");
}

$(window).on("unload",function(){socket.close();});

$("#connect").click(function() {
	socket.send("这是来自客户端的消息" + location.href + new Date());
	$(this).attr("disabled","disabled");
    $("#disconnect").attr("disabled",false);
});

$("#disconnect").click(function() {
	socket.close();
	$(this).attr("disabled","disabled");
	$("#connect").attr("disabled",false);
});