package com.gz.pro.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class GetPropertis {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(GetMapping.class);


    @Value("${test.get.name}")
    private String name;

    @Value("${test.get.id}")
    private Integer id;

    /**
     * application properties 文件属性
     * @return
     */
    @GetMapping("/getParam")
    public String getParam(){

        //日志级别从低到高分为TARACE < DEBUG < INFO < WARN < ERROR < FATL，如果设置为WARN，则低于WARN的信息都不会输出。
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");

        return name+"_"+id;
    }

    /**
     * 接收日期类型
     * @param date
     * @return
     */
    @GetMapping("/getDateParam")
    public Date getDateParam(@RequestParam @DateTimeFormat(pattern="yyyy-MM-dd") Date date){
        System.err.println(date);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dt = simpleDateFormat.format(date);

        System.err.println(dt);

        return date;
    }
    @PostMapping("/test")
    public String test(@RequestBody JSONObject jsonParam){

        System.err.println(jsonParam.toJSONString());

        return jsonParam.toJSONString();
    }
}
