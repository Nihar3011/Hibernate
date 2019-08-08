/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.controller;

import com.mycompany.model.Greetings;
import com.mycompany.serviceimpl.GreetingServiceImpl;

/**
 *
 * @author raj
 */

public class GreetingsController {
    
    private GreetingServiceImpl greetingServiceImpl;

    public GreetingsController() {
        this.greetingServiceImpl = new GreetingServiceImpl();
    }
    
    
    
    public void createHelloWorld(){
        greetingServiceImpl.createHelloWorld(new Greetings("hello"));
    }
    
    public void getHelloWorldById(int id){
        System.out.println(greetingServiceImpl.getHelloWorldById(id));
    }
}
