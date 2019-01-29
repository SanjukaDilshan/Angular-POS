package lk.ijse.Repo;

import lk.ijse.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,Integer> {

}
