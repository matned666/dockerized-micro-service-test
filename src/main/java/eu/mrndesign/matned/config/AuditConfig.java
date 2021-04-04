package eu.mrndesign.matned.config;

import eu.mrndesign.matned.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = {"eu.mrndesign.matned"})
@EnableTransactionManagement
@EnableJpaAuditing(auditorAwareRef="auditorProvider")
public class AuditConfig {

    private final UserService userService;

    public AuditConfig(UserService userService) {
        this.userService = userService;
    }

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl(userService);
    }

}
