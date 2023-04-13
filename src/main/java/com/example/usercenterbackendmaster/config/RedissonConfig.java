package com.example.usercenterbackendmaster.config;

import lombok.Data;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dell
 * @date 2023/4/13 10:24
 * Redisson 配置
 */

@Configuration
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedissonConfig {

    private String host;
    private String port;

    @Bean
    public RedissonClient redissonClient() {
        // 1.快速创建配置
        Config config = new Config();
        String redisAddress = String.format("redis://%s:%s", host, port);
        // useSingleServer(): 使用单个 redis
        // useClusterServers(): 使用集群 redis
        config.useSingleServer().setAddress(redisAddress).setDatabase(3);
        // 2. 创建实例
        RedissonClient redissonClient = Redisson.create(config);
        return redissonClient;
    }

}
