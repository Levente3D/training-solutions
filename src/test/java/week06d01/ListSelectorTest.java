package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


public class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    public void getEvenIndexElementsTest(){
        assertEquals("[almabarack]", ls.getEvenIndexElements(Arrays.asList("alma". "körte", "barack")));
    }

    @Test
    public void getEvenIndexElementsWithNull(){
        assertThrows(IllegalArgumentException.class, ()->ls.getEvenIndexElements(null));
    }

    @Test
    public void getEvenIndexElementsWithEmptyList(){
        assertEquals("",ls.getEvenIndexElements(new ArrayList<>()));
    }
}
