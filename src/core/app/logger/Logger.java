/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.app.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDateTime;

/**
 *
 * @author edangulo
 */
public class Logger {
    
    private static volatile Logger instance;
    private static final String LOGFILEPATH = Paths.get(
            System.getProperty("user.dir"),
            "logs", 
            "app.log").toString();
    
    private FileWriter writer;
    
    private Logger() {
        try {
            writer = new FileWriter(LOGFILEPATH, true);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    public void log(String module, String message, LocalDateTime datetime) {
        try {
            String logmsg = module + " at " + datetime.toString() + ": " + message + "\n";
            writer.write(logmsg);
            writer.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
