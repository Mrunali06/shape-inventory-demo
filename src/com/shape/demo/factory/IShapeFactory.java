package com.shape.demo.factory;

import com.shape.demo.interfaces.IShape;

public interface IShapeFactory {
	public IShape<?> getShape(String shapeType);

}
