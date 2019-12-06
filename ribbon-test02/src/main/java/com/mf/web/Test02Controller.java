package com.mf.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test02Controller
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/6
 * @Version V1.0
 **/
@RestController
public class Test02Controller {

    @Value("8082")
    private String port;

    @RequestMapping("test01")
    public String test01(String name){
        System.out.println(port+"--------name--------"+name);
        return "test01-ok"+port;
    }
}
