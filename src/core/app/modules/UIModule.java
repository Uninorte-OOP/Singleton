/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.app.modules;

import core.app.logger.Logger;
import java.time.LocalDateTime;

/**
 *
 * @author edangulo
 */
public class UIModule {
    
    public void actionPerformed() {
        // Action performed implementation
        Logger logger = Logger.getInstance();
        logger.log(getClass().getSimpleName(), 
                "Action performed successfully", 
                LocalDateTime.now());
    }
    
}
