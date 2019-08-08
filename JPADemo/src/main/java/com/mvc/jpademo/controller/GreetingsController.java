/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.jpademo.controller;

import com.mvc.jpademo.model.Greetings;
import com.mvc.jpademo.serviceimpl.GreetingServiceImpl;

/**
 *
 * @author nihar
 */

public class GreetingsController {
    
    private GreetingServiceImpl greetingServiceImpl;

    public GreetingsController() {
        this.greetingServiceImpl = new GreetingServiceImpl();
    }
    
    
    
    public void createHelloWorld(){
        greetingServiceImpl.createHelloWorld(new Greetings("hello"));
    }
    
   
}
