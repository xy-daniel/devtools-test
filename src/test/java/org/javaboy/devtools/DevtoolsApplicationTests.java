package org.javaboy.devtools;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevtoolsApplicationTests {

    @Autowired
    HelloService helloService;

    //for service test
    @Test
    void service() {
        String hello = helloService.hello("丁代光");
        System.out.println(hello);
    }

    //不再研究Controller的测试没必要
}
