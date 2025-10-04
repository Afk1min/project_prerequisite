package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Rodjer", "Zhelyazni" , (byte) 25);
        userService.saveUser("Robert", "Salvatore",(byte) 27);
        userService.saveUser("Anjei", "Sapkovski",(byte) 28);
        userService.saveUser("Nik", "Perumov",(byte) 29);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
