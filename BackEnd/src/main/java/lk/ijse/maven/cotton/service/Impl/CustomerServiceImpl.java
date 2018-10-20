package lk.ijse.maven.cotton.service.Impl;

import lk.ijse.maven.cotton.dto.CustomerDTO;
import lk.ijse.maven.cotton.dto.UserDTO;
import lk.ijse.maven.cotton.entity.Customer;
import lk.ijse.maven.cotton.entity.User;
import lk.ijse.maven.cotton.repository.CustomerRepository;
import lk.ijse.maven.cotton.repository.UserRepository;
import lk.ijse.maven.cotton.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCustomer(CustomerDTO customerDTO) {
        Customer customer=new Customer(customerDTO.getCustId(),customerDTO.getCustName(),customerDTO.getEmail(),customerDTO.getAddress(),customerDTO.getAge(),
                            customerDTO.getContactNo());
        customerRepository.save(customer);
        return true;
    }

    @Override
    public CustomerDTO getCustomer(String customerId) {
        Customer customer=customerRepository.findById(customerId).get();
        CustomerDTO customerDTO=new CustomerDTO(customer.getCustId(),customer.getCustName(),customer.getEmail(),customer.getAddress(),
                customer.getAge(),customer.getContactNo());
        return customerDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCustomer(String customerId) {
       customerRepository.deleteById(customerId);
       return true;
    }

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        ArrayList<CustomerDTO>alCustomers = new ArrayList<>();
        for (Customer customer : customers) {
            CustomerDTO customerDTO = new CustomerDTO(customer.getCustId(),customer.getCustName(),customer.getEmail(),
                    customer.getAddress(),customer.getAge(),customer.getContactNo());
            alCustomers.add(customerDTO);
        }
        return alCustomers;
    }


}
