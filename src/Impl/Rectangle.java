package Impl;

import Api.Prototype;

import java.util.Objects;

public class Rectangle extends Shape implements Prototype {
    public int width;
    public int height;

    public Rectangle(Rectangle r){
        super(r);
        this.height= r.height;
        this.width=r.width;
    }
    public Prototype clone(){
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return width == rectangle.width &&
                height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
