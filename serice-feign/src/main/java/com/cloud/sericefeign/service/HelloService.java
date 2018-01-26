package com.cloud.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FileName: HelloService
 *
 * @author gcg
 * @create 2018/01/22 14:43
 * Description: hello service
 * History:
 **/
@FeignClient(value = "service-client", fallback = SchedualServiceHiHystric.class) // 调用名称为service-client的服务，并设置熔断器
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
