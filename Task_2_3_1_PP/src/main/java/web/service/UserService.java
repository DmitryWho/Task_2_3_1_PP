package web.service;

import web.model.User;
import java.util.List;

public interface UserService {

    List<User> getAllUser();

    void deleteUserById(int id);

    User updateUser(User user);

    void addUser(User user);

    User getUserById(int id);
}
