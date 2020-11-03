package com.xauv;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author ling yue
 * @Date 2020/10/14 10:39
 * @Desc description
 */
@Configuration
@ComponentScan("com.xauv")
@EnableAspectJAutoProxy
public class AppConfig {
}
