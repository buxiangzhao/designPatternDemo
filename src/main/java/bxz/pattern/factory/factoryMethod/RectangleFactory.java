package bxz.pattern.factory.factoryMethod;

import bxz.pattern.factory.simple.Rectangle;
import bxz.pattern.factory.simple.Shape;

public class RectangleFactory implements ShapeFactory {
  
	public Shape getShape() {
        return new Rectangle();
    }  
  
}  