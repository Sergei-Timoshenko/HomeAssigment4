package main.sport.entities;

import main.utils.Random;

public class Sportsman {
    private final String name;
    private int bestScore;

    public Sportsman(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", bestScore=" + bestScore +
                '}';
    }

    public int getBestScore() {
        return bestScore;
    }

    public void tryToSetTheWorldRecord() {
        int currentScore = Random.getScore();
        if (bestScore < currentScore) {
            bestScore = currentScore;
            SportsmenRecords.setBestSportsman(this);
        }
    }
}
