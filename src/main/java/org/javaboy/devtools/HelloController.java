package org.javaboy.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author daniel
 * @version 1.0.0
 * @date 2020/3/14 16:43
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello devtools! hello world!";
    }

}
