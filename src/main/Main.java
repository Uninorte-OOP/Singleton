/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.app.modules.AuthModule;
import core.app.modules.PaymentModule;
import core.app.modules.UIModule;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        AuthModule auth = new AuthModule();
        PaymentModule payment = new PaymentModule();
        UIModule ui = new UIModule();
        
        auth.register();
        auth.register();
        auth.login();
        
        payment.pay();
        
        ui.actionPerformed();
        ui.actionPerformed();
        
        auth.register();
        
        ui.actionPerformed();
        
        payment.pay();
        payment.pay();
        
        auth.login();
    }
    
}
