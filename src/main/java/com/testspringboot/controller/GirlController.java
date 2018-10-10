package com.testspringboot.controller;


import com.testspringboot.GirlResponsitory;
import com.testspringboot.pojo.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class GirlController {

    @Autowired
    private GirlResponsitory girlResponsitory;


    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlResponsitory.findAll();

    }

    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("age")String age, @RequestParam("name")String name){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setName(name);
        return girlResponsitory.save(girl);
    }
}
