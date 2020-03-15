package org.javaboy.devtools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevtoolsApplication {

    //File---->Setting---->Build---->Compiler---->auto
    //ctrl+alt+shift+/
    //只会出发后台代码的重启---->如果需要静态资源的重启请看配置文件

    public static void main(String[] args) {
        //禁用devtools的自动重启
//        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(DevtoolsApplication.class, args);
    }

}
