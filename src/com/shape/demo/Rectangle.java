package com.shape.demo;

import com.shape.demo.bridge.ShapeAbstractImplementation;
import com.shape.demo.interfaces.IShape;
import com.shape.demo.utils.Constants;

public class Rectangle  extends ShapeAbstractImplementation implements IShape<Rectangle>{
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;	
	}
	
	@Override
	public void draw() {
		x1 = 0;
		x2 = 10;
		y2 = 0;
		y2 = 8;
		System.out.println("Drawing Rectangle");
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

	@Override
	public double getArea() {
		return width * height; 
	}

	@Override
	public String getName() {
		return Constants.RECTANGLE;
	}

	@Override
	public String toString() {
		return " " + this.getName() + " Area :" + this.getArea(); 
	}


}
