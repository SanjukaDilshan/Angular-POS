package lk.ijse.Models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OrderDetail")
public class OrderDetails implements Serializable{

    @Column(name = "qty")
    private double qty;

    @Column(name = "amount")
    private double amount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oid",referencedColumnName = "oid",insertable = false,updatable = false)
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "iid",referencedColumnName = "iid",insertable = false,updatable = false)
    private Item iid;

    @EmbeddedId
    private OrderDetails_PK orderDetails_pk;

    public OrderDetails() {
    }


    public OrderDetails(int odid, Orders orders, Item iid, double qty,double amount) {
        this.orders = orders;
        this.iid = iid;
        this.qty = qty;
        this.amount=amount;
    }

    public OrderDetails(double qty, double amount, Orders orders, Item iid, OrderDetails_PK orderDetails_pk) {
        this.qty = qty;
        this.amount = amount;
        this.orders = orders;
        this.iid = iid;
        this.orderDetails_pk = orderDetails_pk;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getIid() {
        return iid;
    }

    public void setIid(Item iid) {
        this.iid = iid;
    }

    public OrderDetails_PK getOrderDetails_pk() {
        return orderDetails_pk;
    }

    public void setOrderDetails_pk(OrderDetails_PK orderDetails_pk) {
        this.orderDetails_pk = orderDetails_pk;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "qty=" + qty +
                ", amount=" + amount +
                ", orders=" + orders +
                ", iid=" + iid +
                ", orderDetails_pk=" + orderDetails_pk +
                '}';
    }
}

