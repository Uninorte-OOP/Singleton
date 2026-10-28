/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.base.unsafe.Singleton;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("Singleton 1: " + singleton1);
        
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Singleton 2: " + singleton2);
        
        Singleton singleton3 = Singleton.getInstance();
        System.out.println("Singleton 3: " + singleton3);
    }
    
}
