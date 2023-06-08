import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        int expected = 30;
        long actual = service.calculate(1_000,true);
        System.out.println("1."+ expected +"==?=="+ actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(1_000_000,true);
        System.out.println("2."+ expected +"==?=="+ actual);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        int expected = 500;
        long actual = service.calculate(1_000_000,false);
        System.out.println("2."+ expected +"==?=="+ actual);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnRegisteredAndLimit() {
        BonusService service = new BonusService();

        int expected = 10;
        long actual = service.calculate(1000,false);
        System.out.println("2."+ expected +"==?=="+ actual);

        Assertions.assertEquals(expected, actual);
    }
}
