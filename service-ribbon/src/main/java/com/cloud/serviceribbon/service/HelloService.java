package com.cloud.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * FileName: HelloService
 *
 * @author gcg
 * @create 2018/01/22 13:37
 * Description:
 * History:
 **/
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") // 熔断器注解，并设置熔断方法为hiError
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name="+name,String.class);
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
