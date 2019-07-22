/**
 * @Project Name:life-admin-api
 * @Package Name:cn.hoofungson.life.admin.api.config
 * @Since JDK 1.8
 */
package cn.hoofungson.life.admin.api.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 主站配置
 * @Author 胡松 hoofungson@163.com
 * @Date 2019-07-22 17:26
 * @Version V1.0
 */
@Configuration
public class ItemApiConfig {

    /**
     * 配置Bean
     * @return
     * **/
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
