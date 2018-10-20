package lk.ijse.maven.cotton.controller;

import lk.ijse.maven.cotton.dto.CustomerDTO;
import lk.ijse.maven.cotton.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.saveCustomer(customerDTO);
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAllCustomers() {
        return customerService.getAllCustomers();
    }


    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteCustomer(@PathVariable("id") String customerId) {
        return customerService.deleteCustomer(customerId);
    }


    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getCustomer(@PathVariable("id") String customerID) {
        return customerService.getCustomer(customerID);
    }


}
