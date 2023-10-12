package main.utils;

import main.entities.User;
import main.sources.database.Database;

public class Configuration {
    private static final int userId;
    private static final User user;

    static {
        Database.setUsers();
        System.out.println("Searching DB...");
        userId = Random.getRandomUserId();
        System.out.println("Got it.");
        user = Database.getUser(userId);
    }

    public static User getUser() {
        return user;
    }
}
