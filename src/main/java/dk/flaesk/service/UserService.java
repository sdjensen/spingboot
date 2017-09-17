package dk.flaesk.service;

import dk.flaesk.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> userList();

    User findOne(Long id);
    User addUser(User user);
    String deleteUser(Long id);
}
