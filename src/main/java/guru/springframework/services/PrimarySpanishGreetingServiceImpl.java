package guru.springframework.services;

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
