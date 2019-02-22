package com.maple.learn.springbootcode.action.service;

import com.maple.learn.enable.EnableCustService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServcieConfigure {
    @Bean
    public PeopleService peopleService(){
        return new PeopleService();
    }
}
