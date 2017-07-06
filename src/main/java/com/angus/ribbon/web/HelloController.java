package com.angus.ribbon.web;

import com.angus.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with service-ribbon.
 * User: anguszhu
 * Date: Jun,22 2017
 * Time: 16:31
 * description:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/{name}")
    public String getHelloMsg(@PathVariable String name){
        return  helloService.sayHello(name);
    }

}
