/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ecabrerar
 */
@RestController
public class HelloController {
 
    @RequestMapping("/")
   public String index(){
        return "Greetings from Spring Boot!";
   }
}
