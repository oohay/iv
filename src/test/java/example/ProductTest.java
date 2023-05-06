package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ProductTest {
    @Test
    public void testLombok() {
        Product product = Product.builder().plan(1).build();
        assertEquals(1, product.getPlan());
    }
}
