package day7;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing Rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing Circle...");
    }
}

class Cone { // does not extend Shape class
    void draw(){
        System.out.println("Drawing Cone...");
    }
}

class Test {
    //creating a method that accepts only child class of shape
    public static void drawShape(List<? extends Shape> list){
        for (Shape shape: list){
            shape.draw(); // calling method of shape class by child class instance
        }
    }
}

public class Demo7 {
    public static void main(String[] args) {
        List<Rectangle> rectanglesList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Test.drawShape(rectanglesList);
        Test.drawShape(circleList);
//        Test.drawShape(coneList); // does not extend Shape class
    }

}
