package example;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    String name;
    Plan plan;
    Date startDate;
}
