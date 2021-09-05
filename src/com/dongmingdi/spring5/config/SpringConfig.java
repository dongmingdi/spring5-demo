package com.dongmingdi.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.dongmingdi.spring5")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}
