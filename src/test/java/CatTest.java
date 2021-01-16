import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    void addTest() {
        Cat c = new Cat();
        int a = 3;
        int b = 4;
        int expected = 7;
        int output = c.add(a, b);
        Assertions.assertEquals(output, expected);

    }

}
