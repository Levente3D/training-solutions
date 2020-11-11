package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Iron Maiden", LocalDate.of(2018,06,06), LocalTime.of(20,00),LocalTime.of(22,00));
        System.out.println(performance.getInfo());
    }
}
