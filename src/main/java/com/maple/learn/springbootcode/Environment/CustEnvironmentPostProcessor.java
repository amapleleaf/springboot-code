package com.maple.learn.springbootcode.Environment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

public class CustEnvironmentPostProcessor  implements EnvironmentPostProcessor{
    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
            Map<String, Object> source = new HashMap<>();
            source.put("configCenter.zookeeper.address","192.168.8.16:2181");
            source.put("configCenter.redis.address","192.168.8.16:6379");
            MapPropertySource propertiesPropertySource = new MapPropertySource("configCenter",source);
            environment.getPropertySources().addLast(propertiesPropertySource);
    }
}
