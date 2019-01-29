package lk.ijse.Controller;

import lk.ijse.DTO.OrdersDTO;
import lk.ijse.Models.Orders;
import lk.ijse.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;
//
//    @GetMapping("/all")
//    public List<OrdersDTO> getAll(){
//        return orderService.getAllOrders();
//    }
//
    @PostMapping("/add")
    public String saveOrders(@RequestBody Orders orders){
        return orderService.saveOrders(orders);
    }

}
