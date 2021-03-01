package ru.mirea.task10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigure {
    @Bean
    public Merkel merkel(){
        return new Merkel();
    }

    @Bean
    public Trump trump(){
        return new Trump();
    }

    @Bean
    public Biden biden(){
        return new Biden();
    }
}
