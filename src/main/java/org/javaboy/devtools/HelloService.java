package org.javaboy.devtools;

import org.springframework.stereotype.Service;

/**
 * for service test
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/15 9:55
 */
@Service
public class HelloService {

    public String hello(String name) {
        return "hello " + name;
    }

}
