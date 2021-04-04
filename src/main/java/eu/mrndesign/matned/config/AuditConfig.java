package eu.mrndesign.matned.config;

import eu.mrndesign.matned.service.SecurityService;
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

    private final SecurityService securityService;

    public AuditConfig(SecurityService securityService) {
        this.securityService = securityService;
    }

    @Bean
    public AuditorAware<String> auditorProvider() {
        return new AuditorAwareImpl(securityService);
    }

}
