package com.shape.demo.strategy;

import com.shape.demo.interfaces.IShape;

public class ShapeStrategy {
	
	// Strategy: allows one of a family of algorithms to be selected on-the-fly at runtime
	
	/**
	 * This method helps to retrieve Perimeter based on the shapetype
	 * @param shapeType
	 */
	public double getPerimeter(IShape<?> shapeType) {
		return shapeType.getPerimeter();
	}
	
	
	/**
	 * This method helps to retrieve Area based on the shapetype
	 * @param shapeType
	 */
	public double getArea(IShape<?> shapeType) {
		return shapeType.getArea();
	}


}
