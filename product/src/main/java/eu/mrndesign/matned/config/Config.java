package eu.mrndesign.matned.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {

    @Value("${host.name}")
    private String host;

    @Value("${credit.port}")
    private Integer creditPort;


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public String host() { return this.host; }

    @Bean
    public Integer creditPort() { return this.creditPort; }

}
