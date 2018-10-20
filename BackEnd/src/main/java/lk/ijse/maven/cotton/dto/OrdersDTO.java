package lk.ijse.maven.cotton.dto;


import java.util.List;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public class OrdersDTO {
    private int oId;
    private String date;
    private CustomerDTO customer;
    private List<ReservationDTO> reservationDTOs;

    public OrdersDTO() {
    }

    public OrdersDTO(int oId, String date, CustomerDTO customer, List<ReservationDTO> reservationDTOs) {
        this.oId = oId;
        this.date = date;
        this.customer = customer;
        this.reservationDTOs = reservationDTOs;
    }
    public OrdersDTO( CustomerDTO customer) {
        this.customer = customer;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<ReservationDTO> getReservationDTOs() {
        return reservationDTOs;
    }

    public void setReservationDTOs(List<ReservationDTO> reservationDTOs) {
        this.reservationDTOs = reservationDTOs;
    }
}
