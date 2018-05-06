
package com.chao.mymovie.rest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot项目启动器
 * 
 * @author: origen.wang
 * @date: 2017年7月26日
 */

@SpringBootApplication
@MapperScan("com.chao.mymovie.rest.mapper")
public class Application {

	public static void main(String[] args) {

		// 防止启动时自动进入debug
		System.setProperty("spring.devtools.restart.enabled", "false");
		SpringApplication.run(Application.class, args);
	}

}
