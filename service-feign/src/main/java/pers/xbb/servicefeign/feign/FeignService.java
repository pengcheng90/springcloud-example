package pers.xbb.servicefeign.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pers.xbb.servicefeign.hystric.SchedualServiceHiHystric;

@FeignClient(value = "service-eurekaclient", fallback = SchedualServiceHiHystric.class)
public interface FeignService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClient();
}
