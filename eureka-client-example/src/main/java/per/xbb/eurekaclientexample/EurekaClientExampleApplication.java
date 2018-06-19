package per.xbb.eurekaclientexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientExampleApplication.class, args);
    }
}
