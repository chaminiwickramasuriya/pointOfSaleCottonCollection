package lk.ijse.maven.cotton.service.Impl;

import com.mysql.jdbc.StringUtils;
import lk.ijse.maven.cotton.dto.OrdersDTO;
import lk.ijse.maven.cotton.dto.ReservationDTO;
import lk.ijse.maven.cotton.entity.*;
import lk.ijse.maven.cotton.repository.CategoryRepository;
import lk.ijse.maven.cotton.repository.CustomerRepository;
import lk.ijse.maven.cotton.repository.OrdersRepository;
import lk.ijse.maven.cotton.repository.ReservationRepository;
import lk.ijse.maven.cotton.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Ireshika Chamini on 9/24/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public boolean placeOrder(OrdersDTO ordersDTO) {
        Customer customer = customerRepository.findById(ordersDTO.getCustomer().getCustId()).get();
        Orders orders = new Orders(ordersDTO.getDate(), customer);
        ordersRepository.save(orders);
        System.out.println(customer);
//        System.out.println(ordersDTO.getOrderDetailDTOs());

        List<ReservationDTO> orderDetailList = ordersDTO.getReservationDTOs();
        System.out.println("working 1");
        for (ReservationDTO orderDTO : orderDetailList) {
            System.out.println(orderDTO.getOrder_qty());
            Category item = categoryRepository.findById(orderDTO.getCategory().getCatCode()).get();
//             item.setQtyOnHand(orderDTO.getItem().getQtyOnHand()-orderDTO.getOrder_qty());
            item.setQtyOnHand(orderDTO.getCategory().getQtyOnHand() - orderDTO.getOrder_qty());
            categoryRepository.save(item);

            Reservation orderDetail = new Reservation();
            orderDetail.setOrder_qty(orderDTO.getOrder_qty());
            orderDetail.setTotal_amount(orderDTO.getTotal_amount());
            orderDetail.setCategory(item);
            orderDetail.setOrders(orders);

            Reservation_PK orderDetail_pk = new Reservation_PK(item.getCatCode(), orders.getoId());
            orderDetail.setReservation_pk(orderDetail_pk);

            reservationRepository.save(orderDetail);
        }

        return true;
    }



//    @Override
//    public ReservationDTO getItem(String catCode) {
//        return null;
//    }

}


