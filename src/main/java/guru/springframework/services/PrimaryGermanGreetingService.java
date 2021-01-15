package guru.springframework.services;

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
        return repository !=null ? repository.getGermanGreeting() : "Primärer Grußdienst st";
    }
}
