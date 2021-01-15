package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greeting")
//@Primary
@Profile({"en", "default"})
public class PrimaryEnglishGreetingService implements GreetingService {

    private final GreetingRepository repository;

    public PrimaryEnglishGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public PrimaryEnglishGreetingService() {
        this.repository = null;
    }

    @Override
    public String sayGreeting() {
        return repository !=null ? repository.getSpanishGreeting() : "Hello - Primary Greeting service st";
    }
}
