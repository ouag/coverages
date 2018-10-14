package com.ouag.poc.coverages.config;


import com.ouag.poc.coverages.PojoSample;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class helloConfig {


    @Bean
    public PojoSample pojoSample1(){
        return new PojoSample();
    }

    public static void methodconfig1(){
        System.out.println("outfjfjjfjfjfjr");
    }
}
