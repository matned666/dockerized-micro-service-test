package eu.mrndesign.matned.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${host.name}")
    private String host;

    @Value("${credit.port}")
    private Integer creditPort;




    @Bean
    public String host() { return this.host; }

    @Bean
    public Integer creditPort() { return this.creditPort; }

}
