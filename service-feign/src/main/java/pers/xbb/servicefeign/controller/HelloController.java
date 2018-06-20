package pers.xbb.servicefeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.xbb.servicefeign.feign.FeignService;

@RestController
public class HelloController {

    @Autowired
    private FeignService feignService;

    @RequestMapping("/hi")
    public String sayHi() {
        return feignService.sayHiFromClient();
    }
}
