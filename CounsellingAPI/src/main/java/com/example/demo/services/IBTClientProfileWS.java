package com.example.demo.services;

import com.example.demo.model.BTClientResponseVO;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public interface IBTClientProfileWS {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
//    @ApiOperation(value="Get data from github specific username",
//            notes="This api is used to customize information from github on external client needs")
   //@Path("/profile")
    //@ApiParam(value="user") @QueryParam("user")
    public Object reviewUserProfile(String user);
}

