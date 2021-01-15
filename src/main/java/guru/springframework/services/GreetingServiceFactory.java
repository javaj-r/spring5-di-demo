package guru.springframework.services;

public class GreetingServiceFactory {

    private final GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService createGreetingService(String language) {

        if (language == null || language.equals("en")) {
            return new PrimaryEnglishGreetingService(repository);
        } else if (language.equals("ge")) {
            return new PrimaryGermanGreetingService(repository);
        } else if (language.equals("sp")) {
            return new PrimarySpanishGreetingServiceImpl(repository);
        } else {
            return new PrimaryEnglishGreetingService();
        }
    }

}
