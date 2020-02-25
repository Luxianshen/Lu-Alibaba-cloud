package com.redis.demo;

import com.redis.demo.push.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    @Autowired
    private Publisher publisher;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RequestMapping("test")
    public void test(){
        System.out.println("发布消息");
        publisher.publish("testChannel","渠道1消息");
        publisher.publish("testChannel2","渠道2消息");
    }

}
