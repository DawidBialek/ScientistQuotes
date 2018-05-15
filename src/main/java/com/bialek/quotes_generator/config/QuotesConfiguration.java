package com.bialek.quotes_generator.config;

import com.bialek.quotes_generator.resources.Quotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuotesConfiguration {

    @Bean
    public Quotes quotes(){
        return new Quotes();
    }
}
