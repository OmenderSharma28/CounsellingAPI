package com.example.demo.controller;

import com.example.demo.services.IBTClientProfileWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RestController
public class BTClientProfileAPIController {

	@Autowired
    IBTClientProfileWS clientProfileWS;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @GetMapping("/getUserDetail")
    public Object getUserDetails(@RequestParam(value="user") String user){
        return clientProfileWS.reviewUserProfile(user);
    }

}
