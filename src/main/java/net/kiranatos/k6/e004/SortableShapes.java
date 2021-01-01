package net.kiranatos.k6.e004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* Sortable Shapes https://www.codewars.com/kata/586669a8442e3fc307000048
 (Autor: FrankK https://www.codewars.com/users/FrankK)

Although shapes can be very different by nature, they can be sorted by the size of their area.
Task:
    Create different shapes that can be part of a sortable list. The sort order is based on the size of their respective areas:
        The area of a Square is the square of its side
        The area of a Rectangle is width multiplied by height
        The area of a Triangle is base multiplied by height divided by 2
        The area of a Circle is the square of its radius multiplied by π
        The area of a CustomShape is given

    The default sort order of a list of shapes is ascending on area size:
    double side = 1.1234;
    double radius = 1.1234;
    double base = 5;
    double height = 2;
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    shapes.add(new Square(side));
    shapes.add(new Circle(radius));
    shapes.add(new Triangle(base, height));
    Collections.sort(shapes);

    Use the correct π constant for your circle area calculations: Math.PI */

public class SortableShapes {
    public static void main(String[] args) {
        double area, side, radius, base, height, width;
        List<Shape> expected = new ArrayList<Shape>();

        area = 1.1234;
        expected.add(new CustomShape(area));

        side = 1.1234;
        expected.add(new Square(side));

        radius = 1.1234;
        expected.add(new Circle(radius));

        height = 2.;
        base = 5.;
        expected.add(new Triangle(base, height));

        height = 3.;
        base = 4.;
        expected.add(new Triangle(base, height));

        width = 4.;
        expected.add(new Rectangle(width, height));

        area = 16.1;
        expected.add(new CustomShape(area));

        Random random = new Random();
        ArrayList<Shape> actual = createRandomOrderedList(random, expected);

        // Act
        Collections.sort(actual);

        // Assert
        Iterator a = actual.iterator();
        for (Shape e : expected) {
            //assertEquals(e, a.next());
            System.out.println("\nExpected: " + e.area + "\t" + e);
            System.out.println("Actual: " + a.next());
        }        
    }
    private static ArrayList<Shape> createRandomOrderedList(Random random, List<Shape> expected){
        ArrayList<Shape> actual = new ArrayList<Shape>();
        for (Shape shape : expected) {
            int j = random.nextInt(actual.size()+1);
            actual.add(j, shape);
        }
        return actual;
    }
}

// Start your coding here...
class Square extends Shape {
  double side;
  public Square(double side) {
        this.side = side;
        super.area = Math.pow(side, 2);
    }
}

class Rectangle extends Shape {
  double width, height;
  public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        super.area = width * height;
    }
}

class Triangle extends Shape {
  double base, height;
  public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        super.area = base * (height/2.);
    }
}

class Circle extends Shape {
  double radius;
  public Circle(double radius) {
        this.radius = radius;
        super.area = Math.PI * Math.pow(radius, 2);
    }
}

class CustomShape extends Shape {
  double area;
  public CustomShape(double area) {
        this.area = area;
        super.area = this.area;
    }
}

abstract class Shape implements Comparable<Shape>{
    double area;
    @Override
    public int compareTo(Shape o){
        if (area > o.area) return 1;
        else if (area < o.area) return -1;
        else return 0;
    }    
}