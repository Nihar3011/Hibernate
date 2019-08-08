package com.mvc.jpademo.serviceimpl;

import com.mvc.jpademo.dao.GreetingDao;
import com.mvc.jpademo.model.Greetings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raj
 */
public class GreetingServiceImpl {
    
    private GreetingDao greetingDao;

    public GreetingServiceImpl() {
        this.greetingDao = new GreetingDao();
    }
    
    public void createHelloWorld(Greetings greetings){
        greetingDao.createHelloWorld(greetings);
    }
    
    public Greetings getHelloWorldById(int id){
        return greetingDao.getHelloWorldById(id);
    }
    
}
