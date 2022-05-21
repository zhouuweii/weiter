package com.zw.weiter.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.zw.weiter.common.security.annotation.EnableCustomConfig;
import com.zw.weiter.common.security.annotation.EnableRyFeignClients;
import com.zw.weiter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 *
 * @author ZhouWei
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class WeiterJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterJobApplication.class, args);
        System.out.println("定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
