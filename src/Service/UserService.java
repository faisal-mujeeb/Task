package Service;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    User getUserById(Long id);
    User saveUser(User user);
    User deleteUser(Long id);
}
