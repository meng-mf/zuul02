package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Test02
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/6
 * @Version V1.0
 **/
@SpringBootApplication
@RestController
public class Test02 {
    public static void main(String[] args){

        SpringApplication.run(Test02.class,args);

    }

    @RequestMapping("test02")
    public String test02(){
        System.out.println("----test02-----");
        return "test02-ok";
    }
}
