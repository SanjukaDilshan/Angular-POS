package lk.ijse.Models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetails_PK implements Serializable {

    private Integer oid;
    private Integer iid;

    public OrderDetails_PK(){

    }

    public OrderDetails_PK(Integer oid, Integer iid) {
        this.oid = oid;
        this.iid = iid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }
}
