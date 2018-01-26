/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package websocket.blah;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import websocket.blah.model.Message;

@Controller
public class BlahController {


    @MessageMapping("/user/new")
    @SendTo("/user/count")
    public Message greeting(Message message) throws Exception {
        return new Message(200, null);
    }

}
