package com.example.microservice1.controller;

import com.example.microservice1.service.FirstService;
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
@RequestMapping("/first")
@RequiredArgsConstructor
public class MicroserviceOneController {

    private static Logger logger = LoggerFactory.getLogger(MicroserviceOneController.class);
    private final FirstService firstService;
    //public MicroserviceOneController(FirstService firstService){this.firstService  = firstService ;}

    @GetMapping("/service")
    public String serviceEndpoint(@RequestParam String str) {

        logger.info("First service..",str);
        System.out.println("this is First Microservice");
        return firstService.processRequest(str);
    }
}
