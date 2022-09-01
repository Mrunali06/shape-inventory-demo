package com.shape.demo;

import java.util.Comparator;

import com.shape.demo.interfaces.IShape;

public class SortShapeByArea<T> implements Comparator<IShape<T>>{

	@Override
	public int compare(IShape<T> shape1, IShape<T> shape2) {
		
		return (int) (shape1.getArea() - shape2.getArea());
	}

}
