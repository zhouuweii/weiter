package com.zw.weiter.file;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import com.zw.weiter.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 文件服务
 *
 * @author ZhouWei
 */
@EnableCustomSwagger2
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class WeiterFileApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(WeiterFileApplication.class, args);
        System.out.println("文件服务模块启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
