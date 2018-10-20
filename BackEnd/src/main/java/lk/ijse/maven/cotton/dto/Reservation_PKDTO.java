package lk.ijse.maven.cotton.dto;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public class Reservation_PKDTO {
    private String catCode;
    private int oId;

    public Reservation_PKDTO() {
    }

    public Reservation_PKDTO(String catCode, int oId) {
        this.catCode = catCode;
        this.oId = oId;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }
}
