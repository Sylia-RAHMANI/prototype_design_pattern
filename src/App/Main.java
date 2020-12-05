package App;

import Impl.Circle;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,4,"PREMIER",10);
        System.out.println(circle.toString());
        System.out.println(circle.clone().toString());

        Rectangle rectangle = new Rectangle(10,4,50,10);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.clone().toString());
    }
}
