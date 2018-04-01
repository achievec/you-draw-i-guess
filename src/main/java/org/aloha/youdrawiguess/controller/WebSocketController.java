package org.aloha.youdrawiguess.controller;

import lombok.extern.slf4j.Slf4j;
import org.aloha.youdrawiguess.entity.ClientMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class WebSocketController {

//    @Autowired
//    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/sendTest")
    @SendTo("/topic/subscribeTest")
    public ClientMessage sendDemo(ClientMessage message) {
        log.info("接收到了信息" + message.getName());
        return new ClientMessage("1", "你发送的消息为:" + message.getName());
    }

    @SubscribeMapping("/subscribeTest")
    public ClientMessage sub() {
        log.info("XXX用户订阅了我。。。");
        return new ClientMessage("id", "感谢你订阅了我。。。");
    }

}
