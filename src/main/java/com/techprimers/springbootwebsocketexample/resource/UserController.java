package com.techprimers.springbootwebsocketexample.resource;

import com.techprimers.springbootwebsocketexample.model.HelloMessage;
import com.techprimers.springbootwebsocketexample.model.PickUpNotification;
import com.techprimers.springbootwebsocketexample.model.User;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;

@Controller
public class UserController {


    /*@MessageMapping("/user")
    @SendTo("/topic/user")
    public UserResponse getUser(User user) {

        return new UserResponse("Hi " + user.getName());
    }*/

    @Autowired
    SimpMessagingTemplate template;

    @MessageMapping("/pick-me-up")
    @SendTo("/driver/go")
    public PickUpNotification pickMeUp(HelloMessage helloMessage) throws Exception {
        Thread.sleep(1000); // simulated delay
        PickUpNotification pickUpNotification = new PickUpNotification();
        pickUpNotification.setDate(new Date());
        pickUpNotification.setUserName(helloMessage.getName());
        pickUpNotification.setAddFrom("Hammem Linf");
        pickUpNotification.setAddTo("Boumhal");
        return new PickUpNotification();
    }
    @PostMapping("/t-pick-me-up")
    public ResponseEntity<Void> trigerPickMeUp(@RequestBody HelloMessage textMessageDTO) throws Exception {
        PickUpNotification pickUpNotification = new PickUpNotification();
        pickUpNotification.setDate(new Date());
        pickUpNotification.setUserName(textMessageDTO.getName());
        pickUpNotification.setAddFrom("Hammem Linf");
        pickUpNotification.setAddTo("Boumhal");
        template.convertAndSend("/driver/go", pickUpNotification);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
