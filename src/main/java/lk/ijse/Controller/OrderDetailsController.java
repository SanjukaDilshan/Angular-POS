package lk.ijse.Controller;

import lk.ijse.Models.OrderDetails;
import lk.ijse.Services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderdetails")
public class OrderDetailsController {

    @Autowired
    private OrderDetailsService orderDetailsService;

    @PostMapping("/add")
    public String saveOrderDetail(@RequestBody OrderDetails orderDetails){
        return orderDetailsService.saveOrderDetails(orderDetails);
    }
}
