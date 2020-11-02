package com.example.demo;


import com.example.demo.controller.BTClientProfileAPIController;
import com.example.demo.services.ClientProfileWSImpl;
import com.example.demo.services.IBTClientProfileService;
import com.example.demo.services.IBTClientProfileWS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(BTClientProfileAPIController.class)
public class BTClientProfileApiIT {

    @Mock
    ClientProfileWSImpl clientProfileWSImpl;

    @Mock
    IBTClientProfileWS clientProfileWS;

    @Mock
    IBTClientProfileService clientProfileService;

    @Test
    public void reviewProfileUserTest(){

    }
}
