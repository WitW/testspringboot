package com.testspringboot.controller;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.testspringboot.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @Autowired
    private GirlProperties girlProperties;


    @RequestMapping({"/hello/{id}", "/hi/{id}"})
    String home(@PathVariable("id")Integer id){
        return "Hello World "+ girlProperties.getName() +" "+ girlProperties.getAge()+ "id "+id;
    }
}
