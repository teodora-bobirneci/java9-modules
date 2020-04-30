package learn.java9.modules.orders.component;

import learn.java9.modules.customers.model.Customer;
import learn.java9.modules.orders.model.Order;

import java.util.List;

public interface OrdersComponent {

    List<Order> getOrders(Customer c);

}