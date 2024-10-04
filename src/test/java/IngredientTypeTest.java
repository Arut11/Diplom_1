
import org.junit.jupiter.api.Test;
import praktikum.IngredientType;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

public class IngredientTypeTest {

    @Test
    public void sauceNotNull() {
        assertNotNull(IngredientType.valueOf(String.valueOf(SAUCE)),
                "Отсутствует SAUCE");

    }

    @Test
    public void fillingNotNull() {
        assertNotNull(IngredientType.valueOf(String.valueOf(FILLING)),
                "Отсутствует FILLING");

    }

}
