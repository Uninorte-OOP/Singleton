/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.base.safe;

/**
 *
 * @author edangulo
 */
public class Singleton {
    
    // Volatile is used in variables to ensure that changes are visible across 
    // multiple threads and to prevent cache synchronization issues
    private static volatile Singleton instance;
    
    private Singleton() {
        // Private constructor to prevent instantiation
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            // Acquires a lock on the Singleton class object to ensures only 
            // one thread at a time can execute the critical section
            synchronized (Singleton.class) {
                // Double-check for null values to ensure that no other objects 
                // are created
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    
}
