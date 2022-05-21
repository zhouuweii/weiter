package com.zw.weiter.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.zw.weiter.common.security.annotation.EnableRyFeignClients;

/**
 * 认证授权中心
 *
 * @author ZhouWei
 */
@EnableRyFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeiterAuthApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterAuthApplication.class, args);
        System.out.println("认证授权中心启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
