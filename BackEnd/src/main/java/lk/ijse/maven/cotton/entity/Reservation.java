package lk.ijse.maven.cotton.entity;

import javax.persistence.*;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Entity
public class Reservation {

    private int order_qty;
    private double total_amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="catCode",referencedColumnName = "catCode",insertable = false,updatable = false)
    private Category category;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oId", referencedColumnName = "oId",insertable = false,updatable = false)
    private Orders orders;
    @EmbeddedId
    private Reservation_PK reservation_pk;

    public Reservation() {
    }

    public Reservation(int order_qty, double total_amount, Category category, Orders orders, Reservation_PK reservation_pk) {
        this.order_qty = order_qty;
        this.total_amount = total_amount;
        this.category = category;
        this.orders = orders;
        this.reservation_pk = reservation_pk;
    }

    public Reservation(int order_qty, double total_amount, Category category) {
        this.order_qty = order_qty;
        this.total_amount = total_amount;
        this.category = category;
    }

    public int getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(int order_qty) {
        this.order_qty = order_qty;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Reservation_PK getReservation_pk() {
        return reservation_pk;
    }

    public void setReservation_pk(Reservation_PK reservation_pk) {
        this.reservation_pk = reservation_pk;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "order_qty=" + order_qty +
                ", total_amount=" + total_amount +
                ", category=" + category +
                ", orders=" + orders +
                ", reservation_pk=" + reservation_pk +
                '}';
    }
}
