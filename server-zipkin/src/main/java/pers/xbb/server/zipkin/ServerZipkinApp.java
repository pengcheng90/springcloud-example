package pers.xbb.server.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApp {
    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApp.class, args);
    }
}
