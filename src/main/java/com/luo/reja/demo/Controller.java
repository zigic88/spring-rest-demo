/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luo.reja.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author reja
 */
@RestController
public class Controller {

    @Autowired
    AppProperties appProperties;

    @GetMapping("/ping")
    public Response doPingRequest() {
        String message = "Service run on port: " + appProperties.getServicePort();
        Response response = new Response("success", message);
        return response;
    }

}
