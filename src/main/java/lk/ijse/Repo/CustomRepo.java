package lk.ijse.Repo;

import lk.ijse.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomRepo extends JpaRepository<Customer,Integer> {
}
