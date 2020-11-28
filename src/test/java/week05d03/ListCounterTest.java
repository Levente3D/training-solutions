package week05d03;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void CounterTest(){
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("Alma", "dio", "ananasz", "cukor");

        assertEquals(2, listCounter.Counter(testList));
    }

    @Test
    public void CounterEmptyListTest(){
        ListCounter listCounter = new ListCounter();
        List<String> testList = new ArrayList<>();

        assertEquals(0, listCounter.Counter(testList));
    }

    @Test
    public void CounterNonAListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("körte", "kenyér");

        assertEquals(2, listCounter.Counter(testList));
    }
}
