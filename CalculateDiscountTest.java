import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculateDiscountTest {


    @ParameterizedTest
    @CsvSource({"1,0", "2,0"})
    void typeRegularTest(int number, int discount) {
        int actualDiscount = ShoppingCart.calculateDiscount(new ShoppingCart.Item.NEW(), number);
        assertEquals(discount, actualDiscount);
    }

    @ParameterizedTest
    @CsvSource({"1,0", "2,50"})
    void typeSecondTest(int number, int discount) {
        int actualDiscount = ShoppingCart.calculateDiscount(new ShoppingCart.Item.SECOND_FREE(), number);
        assertEquals(discount, actualDiscount);
    }

    @ParameterizedTest
    @CsvSource({"1,0", "10,1", "20,2", "800,80", "900,80"})
    void typeDiscountTest(int number, int discount) {
        int actualDiscount = ShoppingCart.calculateDiscount(new ShoppingCart.Item.REGULAR(), number);
        assertEquals(discount, actualDiscount);
    }

    @ParameterizedTest
    @CsvSource({"1,70", "2,70", "20,72", "100,80", "200,80"})
    void typeSaleTest(int number, int discount) {
        int actualDiscount = ShoppingCart.calculateDiscount(new ShoppingCart.Item.SALE(), number);
        assertEquals(discount, actualDiscount);
    }
}