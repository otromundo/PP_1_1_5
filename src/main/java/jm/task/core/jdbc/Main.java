package jm.task.core.jdbc;

import java.util.List;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        List<User> users;

        userService.createUsersTable();

        userService.saveUser("Сергей", "Королёв", (byte) 59);
        userService.saveUser("Martin Luther", "King", (byte) 39);
        userService.saveUser("Robert", "Oppenheimer", (byte) 62);
        userService.saveUser("Борис", "Ельцин", (byte) 76);

        userService.removeUserById(4);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
