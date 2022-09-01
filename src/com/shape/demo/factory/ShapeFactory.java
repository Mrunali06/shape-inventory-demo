package com.shape.demo.factory;

import java.util.HashMap;

import com.shape.demo.Rectangle;
import com.shape.demo.Square;
import com.shape.demo.Triangle;
import com.shape.demo.interfaces.IShape;

/**
 * Factory Pattern - Objects are created without exposing the creation logic to the client and refer to newly created object using a common interface.
 * @author Mrunali Kamble
 * 
 *
 */
public class ShapeFactory{
	
	static HashMap<Class<?>, IShape<?>> map = new HashMap<Class<?>, IShape<?>>();
	static {
	
		map.put(Rectangle.class, new Rectangle(8, 9));
		map.put(Square.class, new Square(6));
		map.put(Triangle.class, new Triangle(8, 5));
	}
	
	public static <T> IShape<T> getShape(Class<?> clazz){
		
      return  (IShape<T>) map.get(clazz);
    }
}
