package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ireshika Chamini on 10/2/2018.
 */
public interface ContactRepository extends JpaRepository<Contact, Number> {

}
