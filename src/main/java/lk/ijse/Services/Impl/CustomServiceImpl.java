package lk.ijse.Services.Impl;

import lk.ijse.DTO.CustomerDTO;
import lk.ijse.Models.Customer;
import lk.ijse.Repo.CustomRepo;
import lk.ijse.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomServiceImpl implements CustomerService {

    @Autowired
    private CustomRepo customRepo;

    @Override
    public List<CustomerDTO> getAll() {
        List<Customer> allCustomers=customRepo.findAll();
        ArrayList<CustomerDTO> dtos=new ArrayList<>();
        for(Customer customer:allCustomers){
            dtos.add(new CustomerDTO(customer.getCid(),customer.getName(),customer.getAddress(),customer.getTp()));
        }

        return dtos;
    }

    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        customRepo.save(new Customer(customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTp()));
        return "Data saved";
    }

    @Override
    public String updateCustomer(CustomerDTO customerDTO) {
//        CustomerDTO customer=new CustomerDTO(customerDTO.getId(),customerDTO.getName(),customerDTO.getNic(),customerDTO.getAddress(),customerDTO.getTp());
//        return customRepo.save(customer);

//
        String m=null;
        if(customerDTO.getCid()!=null){
            customRepo.save(new Customer(customerDTO.getCid(),customerDTO.getName(),customerDTO.getAddress(),customerDTO.getTp()));
            m="Update Complete";
        }else {
            m="Fail";
        }
        return m;
    }

    @Override
    public Customer searchCustomer(Integer id) {
        Optional<Customer> customer=this.customRepo.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }else{
            return null;
        }
    }

    @Override
    public void deleteCustomer(Integer id) {
        customRepo.deleteById(id);
    }
}
