package lk.ijse.maven.cotton.service.Impl;

import lk.ijse.maven.cotton.service.OrdersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by Ireshika Chamini on 10/11/2018.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OrdersServiceImpl implements OrdersService {

//    @Autowired
//    private OrdersRepository ordersRepository;
//
//    @Autowired
//    private CustomerRepository customerRepository;

//    @Override
//    public ArrayList<OrdersDTO> getAllOrders() {
//        return ordersRepository.getAllOrders();
//    }
}
