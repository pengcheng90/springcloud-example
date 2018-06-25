package pers.xbb.servicerestribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//断路器
@EnableHystrix
//开启HystrixDashboard仪表盘
@EnableHystrixDashboard
public class ServiceRestRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRestRibbonApplication.class, args);
    }

    @Bean
    //开启ribbon负载均衡
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
