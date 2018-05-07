package com.jyc.service.impl;

import org.springframework.stereotype.Component;

import com.jyc.service.SchedualServiceHi;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}