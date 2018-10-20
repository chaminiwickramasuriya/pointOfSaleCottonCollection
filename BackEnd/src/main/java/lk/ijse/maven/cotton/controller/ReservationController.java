package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.CategoryDTO;
import lk.ijse.maven.cotton.dto.OrdersDTO;
import lk.ijse.maven.cotton.dto.ReservationDTO;
import lk.ijse.maven.cotton.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 9/24/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;



    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean placeOrder(@RequestBody OrdersDTO ordersDTO) {
        System.out.println(ordersDTO.getReservationDTOs());
        return reservationService.placeOrder(ordersDTO);
    }

//    @GetMapping(value = "{catCode}", produces = MediaType.APPLICATION_JSON_VALUE)
//    public ReservationDTO getItem(@PathVariable("catCode") String catCode){
//        return reservationService.getItem(catCode);
//    }
}
