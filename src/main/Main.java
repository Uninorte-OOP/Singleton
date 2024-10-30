/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.singleton.Singleton;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance(7, "Hello World");
        System.out.println("Singleton 1:");
        System.out.println("- Value: " + singleton1.getValue());
        System.out.println("- Data: " + singleton1.getData());
        System.out.println("- Add: " + singleton1.add(45));
        
        Singleton singleton2 = Singleton.getInstance(14, "This is a Test");
        System.out.println("\nSingleton 2:");
        System.out.println("- Value: " + singleton2.getValue());
        System.out.println("- Data: " + singleton2.getData());
        System.out.println("- Add: " + singleton2.add(45));
        
        Singleton singleton3 = Singleton.getInstance();
        System.out.println("\nSingleton 3:");
        System.out.println("- Value: " + singleton3.getValue());
        System.out.println("- Data: " + singleton3.getData());
        System.out.println("- Add: " + singleton3.add(45));
    }
    
}
