package eu.mrndesign.matned.config;

import eu.mrndesign.matned.service.SecurityService;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    private final SecurityService securityService;

    public AuditorAwareImpl(SecurityService securityService) {
        this.securityService = securityService;
    }

    @NonNull
    @Override
    public Optional<String> getCurrentAuditor() {
        return securityService.getAuditor();
    }
}
