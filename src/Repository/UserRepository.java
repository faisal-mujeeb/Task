package Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByID(Long Id);
    List<User> findByName(String name);
    List<User> findByAddress(String Address);
    List<User> findByUserType(String userType);


}
