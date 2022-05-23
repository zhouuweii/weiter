package com.zw.weiter.gen;

import com.zw.weiter.common.security.annotation.EnableCustomConfig;
import com.zw.weiter.common.security.annotation.EnableRyFeignClients;
import com.zw.weiter.common.swagger.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成
 *
 * @author ZhouWei
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class WeiterGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterGenApplication.class, args);
        System.out.println("代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
