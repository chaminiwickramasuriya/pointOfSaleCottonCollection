package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.rmi.MarshalledObject;

/**
 * Created by Ireshika Chamini on 8/29/2018.
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
