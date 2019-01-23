package com.maple.learn.springbootcode.action;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class SampleAction {

    @PostMapping("/query/people")
    public Map<String,String> queryPeople(){
        return new HashMap<String,String>(){{put("name", "maple");put("age", "30");}};
    }
}
