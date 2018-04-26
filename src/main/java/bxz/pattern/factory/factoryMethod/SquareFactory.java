package bxz.pattern.factory.factoryMethod;

import bxz.pattern.factory.simple.Shape;
import bxz.pattern.factory.simple.Square;

public class SquareFactory implements ShapeFactory {
  
	public Shape getShape() {
        return new Square();
    }  
  
}  