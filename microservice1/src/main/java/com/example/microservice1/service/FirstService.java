package com.example.microservice1.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    private static final Logger logger = LoggerFactory.getLogger(FirstService.class);

    public String processRequest(String str){
        logger.info("processing request");

        return "response from Microservice 1" + str;
    }
}
