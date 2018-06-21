package pers.xbb.servicefeign.hystric;

import org.springframework.stereotype.Component;
import pers.xbb.servicefeign.feign.FeignService;

@Component
public class SchedualServiceHiHystric implements FeignService {

    @Override
    public String sayHiFromClient() {
        return "sorry,error!";
    }
}
