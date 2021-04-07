package eu.mrndesign.matned.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Value("${host.name}")
    private String host;

    @Value("${credit.port}")
    private String creditPort;




    @Bean
    public String host() { return this.host; }

    @Bean
    public String creditPort() { return this.creditPort; }

}
