package Impl;

import Api.Prototype;

import java.util.Objects;

public abstract class Shape implements Prototype {
    private int x;
    private int y;
    private String name;

    public Shape(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Shape(Shape s){
        if(s!=null){
            this.x=s.x;
            this.y=s.y;
            this.name=s.name;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return x == shape.x &&
                y == shape.y &&
                Objects.equals(name, shape.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, name);
    }
    public abstract Prototype clone();

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
