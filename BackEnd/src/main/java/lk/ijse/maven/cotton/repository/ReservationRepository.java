package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ireshika Chamini on 9/24/2018.
 */
public interface ReservationRepository extends JpaRepository<Reservation, String> {

}
