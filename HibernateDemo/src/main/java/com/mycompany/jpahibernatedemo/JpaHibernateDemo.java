/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jpahibernatedemo;

import com.mycompany.controller.GreetingsController;

/**
 *
 * @author raj
 */
public class JpaHibernateDemo {
    public static void main(String[] args) {
        GreetingsController greetingsController = new GreetingsController();
       greetingsController.createHelloWorld();
       // greetingsController.getHelloWorldById(1);
    }
}
