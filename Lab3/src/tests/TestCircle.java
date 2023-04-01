package tests;

import entity.Circle;
import service.CircleService;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        CircleService circleService = new CircleService();
        Circle c2 = new Circle(2.0);
        System.out.println("The circle c1 has radius of " + c1.getRadius() + " and area of " + circleService.getArea(c1) + " and color of " + c1.getColor());
        System.out.println(c1.toString());
        System.out.println("The circle c2 has radius of " + c2.getRadius() + " and area of " + circleService.getArea(c2) + " and color of " + c2.getColor());
        System.out.println(c2.toString());
        Circle c3 = new Circle(4.0, "blue");
        System.out.println("The circle c3 has radius of " + c2.getRadius() + " and area of " + circleService.getArea(c3) + " and color of " + c3.getColor());
        System.out.println(c3.toString());
        Circle c4 = new Circle();
        c4.setRadius(7.0);
        c4.setColor("green");
        System.out.println("The circle c4 has radius of " + c2.getRadius() + " and area of " + circleService.getArea(c4) + " and color of " + c4.getColor());
        System.out.println(c4.toString());
    }
}
