package one.digitalinnovation.gpf;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

import one.digitalinnovation.CounterController;
import one.digitalinnovation.CounterService;
import one.digitalinnovation.CounterServiceImpl;

@SpringBootTest
class LabPadroesProjetoSpringApplicationTests {

	@Test
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

	private int count = 0;

    @Override
    public void increment() {
        count++;
    }

    @Override
    public int getCurrentCount() {
        return count;
    }

	void increment();
    int getCurrentCount();

}
