package com.example.demo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FailureProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String body = exchange.getIn().getBody(String.class);
        System.out.println("Processing message (will fail): " + body);
        throw new RuntimeException("Simulated failure to trigger DLQ");
    }
}
