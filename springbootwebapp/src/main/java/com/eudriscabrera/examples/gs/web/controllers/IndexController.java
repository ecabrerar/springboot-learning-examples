/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eudriscabrera.examples.gs.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ecabrerar
 */
@Controller
public class IndexController {
    
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
