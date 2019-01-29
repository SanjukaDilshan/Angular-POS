package lk.ijse.Models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Customer")

public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Integer cid;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "tp")
    private int tp;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Orders> orders = new ArrayList<>();// uses a list as many orders for one customer

    public Customer() {
    }



    public Customer(String name, String address, int tp, List<Orders> orders) {
        this.name = name;
        this.address = address;
        this.tp = tp;
        this.orders = orders;
    }

    public Customer(String name, String address, int tp) {
        this.name = name;
        this.address = address;
        this.tp = tp;
    }

    public Customer(Integer cid, String name, String address, int tp) {
        this.cid=cid;
        this.name = name;
        this.address = address;
        this.tp = tp;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTp() {
        return tp;
    }

    public void setTp(int tp) {
        this.tp = tp;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
