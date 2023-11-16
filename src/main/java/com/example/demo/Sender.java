package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    class Data {
        private String data;

        public String getData() {
            return data;
        }
    }

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    StreamBridge streamBridge;

    public void doSomething() {
        var x = new Data();
        x.data = "test";
        var payload = objectMapper.valueToTree(x);
        streamBridge.send("output1", payload);
    }
}
