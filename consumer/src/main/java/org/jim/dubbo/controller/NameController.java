package org.jim.dubbo.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.rpc.ProxyFactory;
import org.jim.dubbo.service.NameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {

    @Reference
    private NameService nameService;

    @RequestMapping("/hello")
    public String hello() {
        ProxyFactory
        return nameService.hello("Dubbo");
    }

}
