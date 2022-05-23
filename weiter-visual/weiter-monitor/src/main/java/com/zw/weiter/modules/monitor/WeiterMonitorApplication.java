package com.zw.weiter.modules.monitor;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 监控中心
 * @author ZhouWei
 */
@EnableAdminServer
@SpringBootApplication
public class WeiterMonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeiterMonitorApplication.class, args);
		System.out.println("监控服务启动成功!\n" +
				" $$$$$$$  $$    $$   $$$$$$$   $$$$$$$   $$$$$$    $$$$$$$  $$$$$$$\n" +
				"$$        $$    $$  $$        $$        $$    $$  $$       $$       \n" +
				" $$$$$$   $$    $$  $$        $$        $$$$$$$$   $$$$$$   $$$$$$ \n" +
				"      $$  $$    $$  $$        $$        $$              $$       $$\n" +
				"$$$$$$$    $$$$$$    $$$$$$$   $$$$$$$   $$$$$$$  $$$$$$$  $$$$$$$ \n");
	}
}
