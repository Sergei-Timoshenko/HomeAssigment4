package main.sport.entities;

public class SportsmenRecords {
    private static Sportsman bestSportsman = new Sportsman("none");

    public static Sportsman getBestSportsman() {
        return bestSportsman;
    }

    public static void setBestSportsman(Sportsman sportsman) {
        if (bestSportsman.getBestScore() < sportsman.getBestScore()) {
            bestSportsman = sportsman;
        }
    }
}
