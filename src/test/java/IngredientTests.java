import com.github.javafaker.Faker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.Ingredient;
import praktikum.IngredientType;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static praktikum.IngredientType.*;

public class IngredientTests {

    static Faker faker = new Faker(Locale.US);
    private Ingredient ingredient;

    public static Object[][] getParameter() {
        return new Object[][] {
                {SAUCE, faker.food().dish(), faker.number().randomNumber()},
                {FILLING, faker.food().dish(), faker.number().randomNumber()},
                {null, faker.food().dish(), faker.number().randomNumber()},
                {SAUCE, null, faker.number().randomNumber()},
                {FILLING, faker.food().dish(), 0}
        };
    }

    @ParameterizedTest
    @MethodSource("getParameter")
    public void IngredientTest(IngredientType ingredientType, String name, float price) {
        ingredient = new Ingredient(ingredientType, name, price);

        assertEquals(ingredientType, ingredient.getType(),
                "Поле type сохранилось некорректно");
        assertEquals(name, ingredient.getName(),
                "Поле name сохранилось некорректно");
        assertEquals(price, ingredient.getPrice(), 0,
                "Поле price сохранилось некорректно");

    }

}


