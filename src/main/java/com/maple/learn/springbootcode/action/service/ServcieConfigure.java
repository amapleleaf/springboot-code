package com.maple.learn.springbootcode.action.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServcieConfigure {
    @Value("${configCenter.zookeeper.address}")
    private String zookeeperAdress;
    public PeopleService peopleService(){
        return new PeopleService();
    }

    public String getZookeeperAdress() {
        return zookeeperAdress;
    }

    public void setZookeeperAdress(String zookeeperAdress) {
        this.zookeeperAdress = zookeeperAdress;
    }
}
