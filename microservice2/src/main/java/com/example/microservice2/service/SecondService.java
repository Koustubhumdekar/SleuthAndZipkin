package com.example.microservice2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecondService {
    private static final Logger logger = LoggerFactory.getLogger(SecondService.class);

    public String processRequest(String str){
        logger.info("processing request");

        return "response from Microservice 2" + str;
    }
}
