package com.demo.helloworld.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName HelloController
 * @Description
 * @Author hup
 * @Date 2020/10/26 11:31
 * @Version 1.0
 */

@RestController
@RequestMapping("/")
@Slf4j
public class InitController {
    @GetMapping("/")
    public String index() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowStr = simpleDateFormat.format(new Date());
        log.info("request index success,time : {}", nowStr);
        return nowStr + ",Hello World! index page.";
    }

}
