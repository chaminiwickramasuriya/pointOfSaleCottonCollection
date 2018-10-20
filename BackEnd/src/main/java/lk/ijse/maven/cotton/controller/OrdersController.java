package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.OrdersDTO;
import lk.ijse.maven.cotton.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 10/11/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

//    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
//    public ArrayList<OrdersDTO> getAllOrders(){return ordersService.getAllOrders();}
}
