package guru.springframework.controllers;

import guru.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingControllerImpl implements GreetingController {

    private final GreetingService greetingService;

    public GreetingControllerImpl(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @Override
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
