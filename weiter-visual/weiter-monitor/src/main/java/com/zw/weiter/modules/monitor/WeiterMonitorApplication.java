package com.zw.weiter.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 *
 * @author ZhouWei
 */
@EnableAdminServer
@SpringBootApplication
public class WeiterMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterMonitorApplication.class, args);
        System.out.println("监控中心启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
