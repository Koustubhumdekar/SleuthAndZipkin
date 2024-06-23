package com.example.api_gateway.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Koustubh Umdekar
 *
 */

@RestController
@RequestMapping("/gateway")
public class GatewayController {

    private static final Logger logger = LoggerFactory.getLogger(GatewayController.class);

    @GetMapping("/gateway")
    public String gatewayEndpoint(){
        logger.info("gateway endpoint..");

        return "API Gateway is working";
    }
}
