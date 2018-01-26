package com.cloud.sericefeign.service;

import org.springframework.stereotype.Component;

/**
 * FileName: SchedualServiceHiHystric
 *
 * @author gcg
 * @create 2018/01/26 9:50
 * Description: Hystric service
 * History:
 **/
@Component
public class SchedualServiceHiHystric implements HelloService {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
