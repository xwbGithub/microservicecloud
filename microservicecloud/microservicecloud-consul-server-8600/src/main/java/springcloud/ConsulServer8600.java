package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by steve on 2018/8/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulServer8600 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulServer8600.class, args);
    }
}
