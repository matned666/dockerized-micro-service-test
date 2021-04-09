package eu.mrndesign.matned.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Configuration
public class Config {

    @Value("${credit.port}")
    private Integer creditPort;

    public Config() {
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public Integer creditPort() {
            return this.creditPort;
    }

}
