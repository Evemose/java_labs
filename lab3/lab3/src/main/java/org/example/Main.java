package org.example;


import org.example.controller.ShapeController;
import org.example.model.Circle;
import org.example.model.Rectangle;
import org.example.model.Triangle;
import org.example.model.Shape;
import org.example.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Rectangle("Red", 5.0, 10.0),
                new Circle("Blue", 7.0),
                new Triangle("Green", 6.0, 8.0),
                new Rectangle("Yellow", 2.0, 3.0),
                new Circle("Red", 10.0),
                new Triangle("Blue", 5.0, 5.0),
                new Rectangle("Green", 7.0, 7.0),
                new Circle("Yellow", 3.5),
                new Triangle("Red", 12.0, 4.0),
                new Rectangle("Blue", 8.0, 1.0)
        };


        ShapeView view = new ShapeView();

        ShapeController controller = new ShapeController(shapes, view);

        controller.processShapes();
    }
}