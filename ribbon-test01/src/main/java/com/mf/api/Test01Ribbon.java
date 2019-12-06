package com.mf.api;

import org.springframework.stereotype.Component;

/**
 * @ClassName Test01Ribbon
 * @Description: TODO
 * @Author mf
 * @Date 2019/12/6
 * @Version V1.0
 **/
@Component
public class Test01Ribbon implements TestApi{
    public String test01(String name) {
        return "出错了 参数";
    }
}
