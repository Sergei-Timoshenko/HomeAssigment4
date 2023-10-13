package main;

import main.entities.User;
import main.figures.drawing.Drawing;
import main.figures.entities.Circle;
import main.figures.entities.Rectangle;
import main.figures.interfaces.FigureShape;
import main.figures.interfaces.Shape;
import main.sport.entities.Sportsman;
import main.sport.entities.SportsmenRecords;
import main.transport.entities.Bicycle;
import main.transport.entities.Car;
import main.utils.Configuration;

public class Main {
    public static void main(String[] args) {
        FigureShape circle = obj -> {
            double radius = ((Circle) obj).radius();
            return 2 * Math.PI * radius;
        };
        System.out.println("Circle area (R = 0.1): " + circle.getArea(new Circle(.1)));

        FigureShape rectangle = obj -> {
            double width = ((Rectangle) obj).width();
            double height = ((Rectangle) obj).height();
            return width * height;
        };
        System.out.println("Rectangle area (H = 0.1, W = 0.2) " + rectangle.getArea(new Rectangle(.1, .2)));
        System.out.println();

        Car car = new Car();
        car.start();
        System.out.println("Car max speed: " + car.getMaxSpeed());
        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.start();
        System.out.println("Bicycle max speed: " + bicycle.getMaxSpeed());
        System.out.println();

        Drawing drawing = new Drawing();
        Shape draw1 = drawing.getShape("Black Square");
        Shape draw2 = drawing.getShape("White Square");
        System.out.printf("We got two paintings: %s and %s", draw1.getDraw(), draw2.getDraw());
        System.out.println();

        Sportsman sportsman1 = new Sportsman("Serhii");
        Sportsman sportsman2 = new Sportsman("Dmytro");
        for (int i = 0; i < 10; i++) {
            sportsman1.tryToBeatTheWorldRecord();
            sportsman2.tryToBeatTheWorldRecord();
        }
        System.out.println("The World Champion: " + SportsmenRecords.getBestSportsman().toString());
        System.out.println();

        User user = Configuration.getUser();
        System.out.println(user);
        user.setName("Terminator");
        System.out.println(user);
    }
}