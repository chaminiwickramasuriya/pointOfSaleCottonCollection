package lk.ijse.maven.cotton.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Embeddable
public class Reservation_PK  implements Serializable{

    private String code;
    private int oid;

    public Reservation_PK() {
    }

    public Reservation_PK(String code, int oid) {
        this.code = code;
        this.oid = oid;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
}
