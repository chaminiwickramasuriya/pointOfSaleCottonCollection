package lk.ijse.maven.cotton.service;

import lk.ijse.maven.cotton.dto.CustomerDTO;
import lk.ijse.maven.cotton.dto.UserDTO;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public interface CustomerService {

    public boolean saveCustomer(CustomerDTO customerDTO);

    public CustomerDTO getCustomer(String customerId);

    public boolean deleteCustomer(String customerId);

    public ArrayList<CustomerDTO> getAllCustomers();

}
