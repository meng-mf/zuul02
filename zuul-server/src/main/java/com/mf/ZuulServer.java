package com.mf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ZuulServer
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/6
 * @Version V1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZuulServer {
    public static void main(String[] args){

        SpringApplication.run(ZuulServer.class,args);

    }

    //健康检查
    @RequestMapping("test03")
    public String test03(){
        System.out.println("-----test03------");
        return "test03";
    }
}
