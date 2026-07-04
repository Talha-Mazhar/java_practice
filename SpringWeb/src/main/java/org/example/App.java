package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );

        Tomcat tomcat = new Tomcat();


        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context,"HelloServlet", new HelloServlet());

        //servlet mapping
        context.addServletMappingDecoded("/hello", "HelloServlet");

        //start the server
        tomcat.start();
        tomcat.getServer().await();
    }
}
