package example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class CostExplorer {

    private HashMap<Plan, Float> prices;

    CostExplorer() {
        prices = new HashMap<>();
        prices.put(Plan.BASIC, 9.99f);
        prices.put(Plan.STANDARD, 49.99f);
        prices.put(Plan.PREMIUM, 249.99f);

    }
    List<Float> monthlyCostList(Customer customer) {
        Product product = customer.getProduct();
        Date startDate = product.getStartDate();
        int startMonth = startDate.getMonth();
        List<Float> result = new ArrayList<>();
        for (int i = 0; i < startMonth; i++) {
            result.add(0f);
        }
        Float price = prices.get(customer.getProduct().getPlan());
        for (int i = startMonth; i < 12; i++) {
            result.add(price);
        }
        return result;
    }

    Float annualCost(Customer customer) {
        List<Float> monthlyCostList = monthlyCostList(customer);
        Float result = 0f;
        for (int i = 0; i < 12; i++) {
            result += monthlyCostList.get(i);
        }
        return result;
    }
}
