package com.zw.weiter.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zw.weiter.common.security.annotation.EnableCustomConfig;
import com.zw.weiter.common.security.annotation.EnableRyFeignClients;
import com.zw.weiter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 *
 * @author ZhouWei
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class WeiterSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterSystemApplication.class, args);
        System.out.println("系统模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
