package io.choerodon.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import io.choerodon.resource.annoation.EnableChoerodonResourceServer;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableChoerodonResourceServer
public class DemoServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoServiceApplication.class, args);
    }
	
	@Value("${testHello}")
    String testHello;
	
	@Value("${number}")
    String number;
	
	@Value("${name}")
    String name;
	
	 @GetMapping("/hello")
    public String hello() {
        return testHello+", "+number+"," +name;
        }
        }

