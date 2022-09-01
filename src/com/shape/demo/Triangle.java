package com.shape.demo;

import com.shape.demo.bridge.ShapeAbstractImplementation;
import com.shape.demo.interfaces.IShape;
import com.shape.demo.utils.Constants;

public class Triangle extends ShapeAbstractImplementation implements IShape<Triangle>{

	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;	
	}

	@Override
	public void draw() {
		x1 = 1;
		x2 = 4;
		y2 = 2;
		y2 = 6;
		System.out.println("Drawing Triangle");
	}

	@Override
	public double getArea() {
		Double areaTriangle = 0.5 * width * height;
		return areaTriangle;
	}

	@Override
	public double getPerimeter() {
		Double hypotenuse = Math.pow(Math.pow(width, 2) 
				+ Math.pow(height, 2),0.5);
		
		return width + height + hypotenuse;
	}

	@Override
	public String getName() {
		
		return Constants.TRIANGLE;
	}

	@Override
	public String toString() {
		return " " + this.getName() + " Area :" + this.getArea(); 
	}
}
