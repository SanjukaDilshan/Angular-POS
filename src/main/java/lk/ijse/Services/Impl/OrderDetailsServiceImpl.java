package lk.ijse.Services.Impl;

import lk.ijse.Models.OrderDetails;
import lk.ijse.Repo.OrderDetailsRepo;
import lk.ijse.Services.OrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    private OrderDetailsRepo orderDetailsRepo;

    @Override
    public String saveOrderDetails(OrderDetails orderDetails) {
        orderDetailsRepo.save(orderDetails);
        return "Saved";
    }
}
