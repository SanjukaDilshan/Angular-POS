package lk.ijse.Controller;

import lk.ijse.DTO.CustomerDTO;
import lk.ijse.Models.Customer;
import lk.ijse.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<CustomerDTO> getAll(){
        return customerService.getAll();
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }

    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.updateCustomer(customerDTO);
    }

    @GetMapping("/Search/{id}")
    public Customer searchCustomer(@PathVariable Integer id){
        return customerService.searchCustomer(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }
}
