package com.maple.learn.springbootcode.action.service;

import java.util.HashMap;
import java.util.Map;

public class PeopleService {
    public Map<String,String> queryPeople(){
       return  new HashMap<String,String>(){{put("name", "maple");put("age", "30");}};
    }
}
