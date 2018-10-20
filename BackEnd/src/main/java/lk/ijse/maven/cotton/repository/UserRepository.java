package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ireshika Chamini on 9/11/2018.
 */
public interface UserRepository extends JpaRepository<User, String> {
}
