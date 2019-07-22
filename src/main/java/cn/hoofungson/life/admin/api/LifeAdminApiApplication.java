package cn.hoofungson.life.admin.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class LifeAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifeAdminApiApplication.class, args);
        log.info("============ LifeAdminApiApplication启动成功 ==============");
    }

}
