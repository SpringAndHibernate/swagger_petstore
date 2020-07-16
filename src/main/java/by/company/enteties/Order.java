package by.company.enteties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private int id;
    private int petId;
    private int quantity;
    private OrderStatus orderStatus;
    private boolean complete;

}
