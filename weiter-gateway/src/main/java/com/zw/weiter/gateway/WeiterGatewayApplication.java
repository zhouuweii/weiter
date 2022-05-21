package com.zw.weiter.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author ZhouWei
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeiterGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterGatewayApplication.class, args);
        System.out.println("Weiter网关启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
