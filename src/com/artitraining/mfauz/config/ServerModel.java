/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artitraining.mfauz.config;

import java.util.logging.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * 2/10/2013
 * @author Sarip
 */
public class ServerModel {
    private static final Logger log = Logger.getLogger(ServerModel.class.getName());
    
     public static void main(String[] args) {
        AbstractApplicationContext ctx =
            new ClassPathXmlApplicationContext(
                new String[]{ "classpath:com/artitraining/mfauz/config/applicationContext.xml",
                              "classpath:com/artitraining/mfauz/config/serverContext.xml"});
        ctx.registerShutdownHook();
        
        String mg = "Server sedang running!";
        log.info(mg);

     }
}
