package lk.ijse.DTO;

import lk.ijse.Models.Customer;

import java.io.Serializable;
import java.util.Date;

public class OrdersDTO implements Serializable {

    private Integer id;
    private Date date;
    private Customer customer;
    private double total;

    public OrdersDTO(){

    }

    public OrdersDTO(Date date, Customer customer, double total) {
        this.date = date;
        this.customer = customer;
        this.total = total;
    }

    public OrdersDTO(Integer id, Date date, Customer customer, double total) {
        this.id=id;
        this.date=date;
        this.customer=customer;
        this.total=total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
