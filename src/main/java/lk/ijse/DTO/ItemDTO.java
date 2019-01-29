package lk.ijse.DTO;

import java.io.Serializable;

public class ItemDTO implements Serializable {

    private Integer id;
    private String name;
    private double price;
    private double qty;

    public ItemDTO(){

    }

    public ItemDTO(Integer id, String name, double price, double qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
