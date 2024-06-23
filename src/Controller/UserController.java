package Controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
     @Autowired
     private UserService userService;

     @GetMapping
     public List<User> getAllUsers() {
          return userService.getAllUsers();
     }

     @GetMapping("/{id}")
     public User getUserById(Long id) {
          return userService.getUserById(id);
     }

     @PostMapping
     public User createUser(@RequestBody User user) {
          return userService.saveUser(user);
     }

     @PutMapping("/{id}")
     public User updateUser(@PathVariable Long id, @RequestBody User user) {
          user.setId(id);
          return userService.saveUser(user);
     }

     @DeleteMapping("/{id}")
     public void deleteUser(@PathVariable Long id) {
          userService.deleteUser(id);
     }

}
