package web.service;

import web.models.User;

import javax.validation.Valid;
import java.util.List;

public interface UserService {
    List<User> getUsers();
    void addUser(User user);
    User getUserById(long id);
    void deleteUser(long id);
    void editUser(@Valid User user);
}
