package Impl;

import Api.Prototype;

import java.util.Objects;

public class Circle extends Shape implements Prototype {
    private int radius;

    public Circle(int x, int y, String name, int radius) {
        super(x, y, name);
        this.radius = radius;
    }

    public Circle(Shape s, int radius) {
        super(s);
        this.radius = radius;
    }

    public Circle(Circle c){
        super(c);
        this.radius =c.radius;
    }
    @Override
    public Prototype clone(){
        return new Circle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
