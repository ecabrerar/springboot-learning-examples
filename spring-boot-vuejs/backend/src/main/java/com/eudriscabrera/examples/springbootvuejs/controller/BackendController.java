package com.eudriscabrera.examples.springbootvuejs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.springframework.boot.Banner.Mode.LOG;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ecabrerar
 */
@RestController()
@RequestMapping("/api")
public class BackendController {

    private static final Logger LOG = LoggerFactory.getLogger(BackendController.class);

    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";

   
    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        LOG.info("GET called on /hello resource");

        return HELLO_TEXT;
    }

}
