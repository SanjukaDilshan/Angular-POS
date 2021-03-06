package lk.ijse.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

    private Integer cid;
    private String name;
    private String address;
    private int tp;

    public CustomerDTO(){

    }

    public CustomerDTO(Integer cid, String name, String address, int tp) {
        this.cid = cid;
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
}
