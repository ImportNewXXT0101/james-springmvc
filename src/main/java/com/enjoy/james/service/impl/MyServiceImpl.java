package com.enjoy.james.service.impl;

import com.enjoy.james.annotation.MockService;
import com.enjoy.james.service.MyService;

@MockService("MyServiceImpl")
public class MyServiceImpl implements MyService {
    
    public String query(String name, String age) {
        
        return "{name="+name+",age="+age+"}";
    }
    
    public String insert(String param) {
        // TODO Auto-generated method stub
        return  "insert successful.....";
    }
    
    public String update(String param) {
        // TODO Auto-generated method stub
        return "update successful.....";
    }
    
}
