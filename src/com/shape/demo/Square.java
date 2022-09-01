package com.shape.demo;

import com.shape.demo.bridge.ShapeAbstractImplementation;
import com.shape.demo.interfaces.IShape;
import com.shape.demo.utils.Constants;

public class Square extends ShapeAbstractImplementation implements IShape<Square> {
	private double side;
	
	public Square(double side) {
		this.side = side;	
	}
	
	@Override
	public void draw() {
		x1 = 2;
		x2 = 15;
		y2 = 6;
		y2 = 18;
		System.out.println("Drawing Square");
	}

	@Override
	public double getArea() {
		return side*side;
	}

	@Override
	public double getPerimeter() {
		return 4*side;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Constants.SQUARE;
	}
	
	@Override
	public String toString() {
		return " " + this.getName() + " Area :" + this.getArea(); 
	}

}
