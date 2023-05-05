package example;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CustomerTest {
    @Test
    public void testCreateCustomer() {
        Product product = new Product();
        product.setPlan(Plan.BASIC);
        product.setStartDate(new Date());
        product.setName("Jira");
        Customer customer = new Customer();
        customer.setName("Adam");
        customer.setProduct(product);

        assertEquals(Plan.BASIC, product.getPlan());
        assertEquals(product, customer.getProduct());

        CostExplorer costExplorer = new CostExplorer();
        List<Float> monthlyCost = costExplorer.monthlyCostList(customer);
        Float annual = costExplorer.annualCost(customer);

    }
}
