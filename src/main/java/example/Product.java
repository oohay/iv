package example;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Product {
    String name;
    Integer plan;
    Date startDate;
}
