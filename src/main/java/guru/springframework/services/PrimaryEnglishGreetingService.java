package guru.springframework.services;

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
        return repository !=null ? repository.getEnglishGreeting() : "Hello - Primary Greeting service st";
    }
}
