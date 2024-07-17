package one.digitalinnovation;

public class CounterServiceImpl implements CounterService {
    private int count = 0;

    @Override
    public void increment() {
        count++;
    }

    @Override
    public int getCurrentCount() {
        return count;
    }

}
