/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.singleton;

/**
 *
 * @author edangulo
 */
public final class Singleton {
    
    private static Singleton instance;
    
    private int value;
    private String data;
    
    private Singleton(int value, String data) {
        this.value = value;
        this.data = data;
    }
    
    public static Singleton getInstance() {
        return instance;
    }
    
    public static Singleton getInstance(int value, String data) {
        if (instance == null) {
            instance = new Singleton(value, data);
        }
        return instance;
    }

    public int getValue() {
        return value;
    }

    public String getData() {
        return data;
    }
    
    public int add(int number) {
        return this.value + number;
    }
    
}
