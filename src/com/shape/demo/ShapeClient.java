package com.shape.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.shape.demo.factory.ShapeFactory;
import com.shape.demo.interfaces.IShape;
import com.shape.demo.strategy.ShapeStrategy;
import com.shape.demo.utils.Constants;

public class ShapeClient {
	public static void main(String[] args) {
		
		// ----------------------------------------
		// Demonstrating Factory pattern
        
        IShape<Rectangle> rectangle = ShapeFactory.getShape(Rectangle.class);
        IShape<Triangle> triangle =  ShapeFactory.getShape(Triangle.class);
        IShape<Square> square = ShapeFactory.getShape(Square.class);
        rectangle.draw();
        triangle.draw();
        square.draw();
        
        // ----------------------------------------
        // Demonstrating Strategy pattern
        ShapeStrategy strategy = new ShapeStrategy();
        
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Perimeter:");
        System.out.println();
        System.out.println(Constants.RECTANGLE + Constants.SPACE + strategy.getPerimeter(rectangle));
        System.out.println(Constants.TRIANGLE + Constants.SPACE + strategy.getPerimeter(triangle));
        System.out.println(Constants.SQUARE + Constants.SPACE + strategy.getPerimeter(square));
        
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println();
        System.out.println("Area:");
        System.out.println(Constants.RECTANGLE + Constants.SPACE + strategy.getArea(rectangle));
        System.out.println(Constants.TRIANGLE + Constants.SPACE + strategy.getArea(triangle));
        System.out.println(Constants.SQUARE +  + strategy.getArea(square));
                      
        System.out.println();
       // ----------------------------------------
       // Demonstrating Iterator pattern
        ArrayList<IShape<?>> shapesList = new ArrayList<>();
        shapesList.add(rectangle);
        shapesList.add(triangle);
        shapesList.add(square);
        
        System.out.println("Shapes in ascending order to area");
        
        // Use of comparator also depicts strategy design pattern
        final List<IShape<?>> shapesSortedList = shapesList.stream().sorted(new SortShapeByArea<>()).collect(Collectors.toList());
        shapesSortedList.forEach(shape -> System.out.println(shape.toString()));
       
        
       // ----------------------------------------
       // Demonstrating Bridge pattern
       System.out.println();
       System.out.println("Rectangle contains co-ordinates (1,5) :" + ((Rectangle)rectangle).findPoint(1, 5));
       System.out.println("Triangle contains co-ordinates (5,6) :" + ((Triangle)triangle).findPoint(5, 6));
       System.out.println("Square contains co-ordinates (6,5) :" + ((Square)square).findPoint(6, 5));
        
    }
}
