package lk.ijse.Services.Impl;

import lk.ijse.DTO.OrdersDTO;
import lk.ijse.Models.Orders;
import lk.ijse.Repo.OrdersRepo;
import lk.ijse.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepo ordersRepo;

//    @Override
//    public List<OrdersDTO> getAllOrders() {
//        List<Orders> allOrders=ordersRepo.findAll();
//        ArrayList<OrdersDTO> dtos=new ArrayList<>();
//        for(Orders orders:allOrders){
//            dtos.add(new OrdersDTO(orders.getId(),orders.getDate(),orders.getCustomer(),orders.getTotal()));
//        }
//        return dtos;
//    }
//
    @Override
    public String saveOrders(Orders orders) {
        ordersRepo.save(orders);
        return "Data Saved";
    }
}
