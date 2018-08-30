package com.sf.wdx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 描述：MySpringBootApplication
 * 			通过@ComponentScan可以扫描指定的包结构，如果省略不指定，框架默认会扫描主程序所在包及子包
 * 			通过@SpringBootApplication标记当前应用为SpringBoot项目
 * 			通过@EnableTransactionManagement启用事务管理器
 * 
 * 			启动SpringBoot，有web模块会自带tomcat端口默认8080，会自动读取类路径下或类路径/config下的application.properties或application.yml
 * @author 80002888
 * @date   2018年8月29日
 */
@MapperScan(value={"com.sf.wdx.dao"})
@EnableTransactionManagement
@ComponentScan
@SpringBootApplication
public class MySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);
		
		// 可以手动创建并调用run方法，这样可以对SpringApplication进行一些设置
//		SpringApplication springApplication = new SpringApplication(MySpringBootApplication.class);
//		springApplication.setBannerMode(Banner.Mode.OFF);
//		springApplication.run(args);
	}

}
