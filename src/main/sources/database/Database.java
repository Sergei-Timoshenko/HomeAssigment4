package main.sources.database;

import main.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private static List<User> users = new ArrayList<User>();

    public static void setUsers() {
        users.add(new User("Dmytro", "Azzarnoy", 0));
        users.add(new User("Serhii", "serhiitymoshenko", 1));
    }

    public static User getUser(int id) {
        return users.get(id);
    }
}
