
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.Bun;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTests {

    Bun bun;

    public static Object[][] getParameters() {
        return new Object[][] {
                {"black bun", 100},
                {"", 50.987654f},
                {"50.987654f", -1},
                {"!@#$@$@", 0}

        };
    }

    @ParameterizedTest
    @MethodSource("getParameters")
    public void BunTest(String name, float price) {
        bun = new Bun(name, price);
        assertEquals(name, bun.getName(),
                "Поле name сохранилось некорректно");
        assertEquals(price, bun.getPrice() , 0.00001,
                "Поле price сохранилось некорревтно");

    }

}