package com.shape.demo.bridge;


public abstract class ShapeAbstractImplementation {
	
	//x-coordinates and y-coordinates for shape
	public int x1, y1, x2, y2;
	public String shapeType = null;
	
	
	/**
	 * This methods is common for all the the shapes, thus can be decoupled from individual class implementations.
	 * This demonstrates use of Bridge design pattern which suggests -  Decouple the functional abstraction from the implementation so that the two can vary independently.
	 */	
	public boolean findPoint(int x, int y)
	{
		if (x > x1 && x < x2 &&	y > y1 && y < y2)
			return true;

		return false;
	}
}
