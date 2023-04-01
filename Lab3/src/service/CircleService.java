package service;

import entity.Circle;

public class CircleService {
    public double getArea(Circle circle) {
        return Math.PI * (circle.getRadius() * circle.getRadius());
    }
}