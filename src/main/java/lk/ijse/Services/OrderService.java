package lk.ijse.Services;

import lk.ijse.DTO.OrdersDTO;
import lk.ijse.Models.Orders;

import java.util.List;

public interface OrderService {


//    List<OrdersDTO> getAllOrders();

    String saveOrders(Orders orders);
}
