package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greeting")
@Profile({"ge"})
public class PrimaryGermanGreetingService implements GreetingService {

    private final GreetingRepository repository;

    public PrimaryGermanGreetingService(GreetingRepository repository) {
        this.repository = repository;
    }

    public PrimaryGermanGreetingService() {
        this.repository = null;
    }

    @Override
    public String sayGreeting() {
        return repository !=null ? repository.getSpanishGreeting() : "Primärer Grußdienst st";
    }
}
