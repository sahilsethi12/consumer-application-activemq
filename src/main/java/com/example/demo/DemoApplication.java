package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class DemoApplication {

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        // Example: setting JVM properties for SSL or AMQ connections
       // System.setProperty("javax.net.ssl.trustStore", "/Users/sasethi/Downloads/devfile-sample-java-springboot-basic/clientca.ts");
       // System.setProperty("javax.net.ssl.trustStorePassword", "redhat");
        SpringApplication.run(DemoApplication.class, args);
    }

}
