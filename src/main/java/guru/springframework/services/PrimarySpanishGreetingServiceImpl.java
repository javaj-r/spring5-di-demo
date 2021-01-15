package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greeting")
@Profile({"sp"})
public class PrimarySpanishGreetingServiceImpl implements GreetingService {

    private final GreetingRepository repository;

    public PrimarySpanishGreetingServiceImpl(GreetingRepository repository) {
        this.repository = repository;
    }

    public PrimarySpanishGreetingServiceImpl() {
        this.repository = null;
    }

    @Override
    public String sayGreeting() {
        return repository !=null ? repository.getSpanishGreeting() : "Servicio de Saludo Primario st";
    }
}
