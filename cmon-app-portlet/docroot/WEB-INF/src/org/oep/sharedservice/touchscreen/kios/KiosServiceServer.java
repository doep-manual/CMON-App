
package org.oep.sharedservice.touchscreen.kios;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.1
 * 2014-09-05T15:13:12.333+07:00
 * Generated source version: 2.6.1
 * 
 */
 
public class KiosServiceServer{

    protected KiosServiceServer() throws Exception {
        Object implementor = new org.oep.sharedservice.touchscreen.kios.KiosImpl();
        String address = "http://localhost:9090/KiosImplPort";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws Exception { 
        new KiosServiceServer();
        
        Thread.sleep(5 * 60 * 1000); 
        System.exit(0);
    }
}
 
 