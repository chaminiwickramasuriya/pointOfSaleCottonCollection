package lk.ijse.maven.cotton.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oId;
    private String date;
    @ManyToOne
    private Customer customer;



    public Orders() {
    }


    public Orders(String date, Customer customer) {
        this.date = date;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    @Override
    public String toString() {
        return "Orders{" +
                "oid=" + oId +
                ", date='" + date + '\'' +
                ", customer=" + customer +
                '}';
    }
}
