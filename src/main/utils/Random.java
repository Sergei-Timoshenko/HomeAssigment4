package main.utils;


import main.entities.User;

import java.util.Arrays;

public class Random {
    private static java.util.Random event = new java.util.Random(System.nanoTime());

    public static int getEvent() {
        return event.nextInt(25 + 1);
    }

    public static int getScore() {
        return event.nextInt(666666 + 1);
    }

    public static int getRandomUserId() {
        return event.nextInt(2);
    }
}
