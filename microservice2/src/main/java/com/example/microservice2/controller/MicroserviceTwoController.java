package com.example.microservice2.controller;

import com.example.microservice2.service.SecondService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/second")
@RequiredArgsConstructor
public class MicroserviceTwoController {
    private static Logger logger = LoggerFactory.getLogger(MicroserviceTwoController.class);
    private final SecondService secondService;
    //public MicroserviceOneController(FirstService firstService){this.firstService  = firstService ;}

    @GetMapping("/service")
    public String serviceEndpoint(@RequestParam String str) {

        logger.info("Second service..",str);
        System.out.println("this is Second Microservice");
        return secondService.processRequest(str);
    }
}

