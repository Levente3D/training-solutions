package week06d03;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SeriesTest {

    @Test
    void testInc(){
        assertEquals(Series.Type.INC, new Series().calculateSeriesType(List.of(1, 2, 3, 4)));
    }

    @Test
    void testDec(){
        assertEquals(Series.Type.DEC, new Series().calculateSeriesType(List.of(4, 3, 2, 1)));
    }

    @Test
    void testRandom(){
        assertEquals(Series.Type.RANDOM, new Series().calculateSeriesType(List.of(4, 3, 4, 1)));
    }

    @Test
    void testException(){
        assertThrows(IllegalArgumentException.class, () ->{
            new Series().calculateSeriesType(List.of(2));
        });
    }
}
