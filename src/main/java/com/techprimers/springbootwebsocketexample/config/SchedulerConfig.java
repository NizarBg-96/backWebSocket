package com.techprimers.springbootwebsocketexample.config;

import com.techprimers.springbootwebsocketexample.model.PickUpNotification;
import com.techprimers.springbootwebsocketexample.model.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@EnableScheduling
@Configuration
public class SchedulerConfig {

    @Autowired
    SimpMessagingTemplate template;

    /*@Scheduled(fixedDelay = 3000)
    public void sendAdhocMessages() {
        template.convertAndSend("/topic/user", new UserResponse("Fixed Delay Scheduler"));
    }*/


  /*  @Scheduled(fixedDelay = 3000)
    public void sendMessages() {

        PickUpNotification pickUpNotification = new PickUpNotification();
        pickUpNotification.setDate(new Date());
        pickUpNotification.setUserName("Scheduler");
        pickUpNotification.setAddFrom("Schedueler");
        pickUpNotification.setAddTo("Schedueler");
        template.convertAndSend("/driver/go", pickUpNotification);
    }*/
}
