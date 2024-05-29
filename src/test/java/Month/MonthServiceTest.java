package Month;

import org.example.MonthService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    public void testMonth() {

        int expected = 3;
        MonthService service = new MonthService();
        int actual = service.calculate(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMonth2() {

        int expected = 2;
        MonthService service = new MonthService();
        int actual = service.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}