package bxz.pattern.factory.abstractMethod;

import bxz.pattern.factory.simple.Circle;
import bxz.pattern.factory.simple.Rectangle;
import bxz.pattern.factory.simple.Shape;
import bxz.pattern.factory.simple.Square;

public class ShapeFactory extends AbstractFactory {

   public static final String CIRCLE = "CIRCLE";//兰州拉面
   public static final String RECTANGLE = "RECTANGLE";//泡面
   public static final String SQUARE ="SQUARE";//干扣面

	@Override
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }        
      if(shapeType.equalsIgnoreCase(CIRCLE)){
         return new Circle();
      } else if(shapeType.equalsIgnoreCase(RECTANGLE)){
         return new Rectangle();
      } else if(shapeType.equalsIgnoreCase(SQUARE)){
         return new Square();
      }
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      return null;
   }
}