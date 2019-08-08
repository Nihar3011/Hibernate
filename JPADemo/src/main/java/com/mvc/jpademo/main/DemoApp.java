/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.jpademo.main;

import com.mvc.jpademo.controller.GreetingsController;

/**
 *
 * @author nihar
 */
public class DemoApp {
    public static void main(String[] args) {
       GreetingsController greetingsController = new GreetingsController();
       greetingsController.createHelloWorld();
       JPAUtil.shutdown();
    }
}
