package org.jim.dubbo.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class NameServiceImpl implements NameService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

}
