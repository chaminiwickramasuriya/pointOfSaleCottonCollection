package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.dto.OrdersDTO;
import lk.ijse.maven.cotton.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

/**
 * Created by Ireshika Chamini on 9/24/2018.
 */
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

//
//    @Query(value = "SELECT * FROM Orders o, Reservation r where o.oid = r.oid", nativeQuery = true)
//    public ArrayList<OrdersDTO> getAllOrders();
//

}