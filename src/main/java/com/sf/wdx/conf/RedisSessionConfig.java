package com.sf.wdx.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * 描述：启用redis，redis配置类
 * @author 80002888
 * @date   2018年8月30日
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {

}
