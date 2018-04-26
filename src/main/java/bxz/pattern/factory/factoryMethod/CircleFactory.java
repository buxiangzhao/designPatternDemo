package bxz.pattern.factory.factoryMethod;

import bxz.pattern.factory.simple.Circle;
import bxz.pattern.factory.simple.Shape;

public class CircleFactory implements ShapeFactory {
  
	public Shape getShape() {
        return new Circle();
    }  
  
}  