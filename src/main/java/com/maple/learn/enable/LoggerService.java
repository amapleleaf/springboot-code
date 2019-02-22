package com.maple.learn.enable;

import org.springframework.context.annotation.Configuration;

public class LoggerService {
    public void saveLog(String log){
        System.out.println("log is saved");
    }
}
