package com.redhat.training.gpte.springboot;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
    	String payload = exchange.getIn().getBody(String.class);
        // do something with the payload and/or exchange here
       exchange.getIn().setBody("Processed the customer data");
    }
}