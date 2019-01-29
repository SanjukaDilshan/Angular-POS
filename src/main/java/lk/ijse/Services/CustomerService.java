package lk.ijse.Services;

import lk.ijse.DTO.CustomerDTO;
import lk.ijse.Models.Customer;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> getAll();

    String saveCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerDTO customerDTO);

    Customer searchCustomer(Integer id);

    void deleteCustomer(Integer id);
}
