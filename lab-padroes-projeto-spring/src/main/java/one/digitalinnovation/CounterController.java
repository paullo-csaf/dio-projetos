package one.digitalinnovation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class CounterController {
    private final CounterService counterService;

    @Autowired
    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping("/increment")
    public String incrementCounter() {
        counterService.increment();
        return "Contador incrementado. Valor atual: " + counterService.getCurrentCount();
    }

    @GetMapping("/current")
    public String getCurrentCount() {
        return "Valor atual do contador: " + counterService.getCurrentCount();
    }
}
