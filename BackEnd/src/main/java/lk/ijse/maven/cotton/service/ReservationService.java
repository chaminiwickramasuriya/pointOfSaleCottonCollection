package lk.ijse.maven.cotton.service;

import lk.ijse.maven.cotton.dto.OrdersDTO;


/**
 * Created by Ireshika Chamini on 9/24/2018.
 */
public interface ReservationService {

    public boolean placeOrder(OrdersDTO ordersDTO);

//    public ReservationDTO getItem(String catCode);
}
