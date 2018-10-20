package lk.ijse.maven.cotton.dto;


import lk.ijse.maven.cotton.entity.Category;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public class ReservationDTO {
    private int order_qty;
    private double total_amount;
    private Category category;

    public ReservationDTO() {
    }

    public ReservationDTO(int order_qty, double total_amount, Category category) {
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
    //    public void setCategory(Category category) {
//        this.category = category;
//    }

    @Override
    public String toString() {
        return "ReservationDTO{" +
                "order_qty=" + order_qty +
                ", total_amount=" + total_amount +
                ", category=" + category +
                '}';
    }
}
