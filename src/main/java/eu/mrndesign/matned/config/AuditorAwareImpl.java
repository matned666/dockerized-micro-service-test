package eu.mrndesign.matned.config;

import eu.mrndesign.matned.service.UserService;
import org.springframework.data.domain.AuditorAware;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {

    private final UserService userService;

    public AuditorAwareImpl(UserService userService) {
        this.userService = userService;
    }

    @NonNull
    @Override
    public Optional<String> getCurrentAuditor() {
        return userService.getAuditor();
    }
}
