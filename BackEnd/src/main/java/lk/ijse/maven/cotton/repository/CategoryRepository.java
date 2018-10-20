package lk.ijse.maven.cotton.repository;

import lk.ijse.maven.cotton.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ireshika Chamini on 9/6/2018.
 */
public interface CategoryRepository extends JpaRepository<Category, String> {
}
