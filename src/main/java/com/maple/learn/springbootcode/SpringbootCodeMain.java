package com.maple.learn.springbootcode;

import com.maple.learn.enable.CounterService;
import com.maple.learn.enable.EnableCustService;
import com.maple.learn.enable.LoggerService;
import com.maple.learn.enable.MonitorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@EnableCustService
@SpringBootApplication
public class SpringbootCodeMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext  = SpringApplication.run(SpringbootCodeMain.class, args);
        System.err.println("-->"+applicationContext.getBean(LoggerService.class));
        System.err.println("-->"+applicationContext.getBean(MonitorService.class));
        System.err.println("-->"+applicationContext.getBean(CounterService.class));
    }
}
