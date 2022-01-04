package com.example.springcloudsubservice;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootTest(classes = SpringCloudSubserviceApplication.class)
public abstract class BaseClass {

    @BeforeEach
    public void setUp() throws IOException, URISyntaxException {
        RestAssuredMockMvc.standaloneSetup(new CarsController());
    }
}
