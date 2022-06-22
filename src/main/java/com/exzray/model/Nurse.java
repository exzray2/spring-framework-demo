package com.exzray.model;

import org.springframework.stereotype.Component;

@Component
public class Nurse implements Staff {

    @Override
    public void info() {
        System.out.println("nurse info!");
    }

}
