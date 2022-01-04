package com.example.springcloudsubservice;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

@RestController
public class CarsController {
    private final ArrayList<Object> carsJson;

    public CarsController() throws URISyntaxException, IOException {
        URL resource = CarsController.class.getResource("/cars.json");
        File filepath = Paths.get(resource.toURI()).toFile();
        ObjectMapper mapper = new ObjectMapper();
        this.carsJson = (ArrayList<Object>) mapper.readValue(filepath, Object.class);
    }

    @GetMapping("/")
    public ArrayList<Object> getCars() {
        return this.carsJson;
    }
}
