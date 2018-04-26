package bxz.pattern.factory.abstractMethod;

import bxz.pattern.factory.simple.Shape;

public class ColorFactory extends AbstractFactory {

   public static final String RED = "RED";//兰州拉面
   public static final String GREEN = "GREEN";//泡面
   public static final String BLUE ="BLUE";//干扣面

	@Override
   public Shape getShape(String shapeType){
      return null;
   }
   
   @Override
   public Color getColor(String color) {
      if(color == null){
         return null;
      }        
      if(color.equalsIgnoreCase(RED)){
         return new Red();
      } else if(color.equalsIgnoreCase(GREEN)){
         return new Green();
      } else if(color.equalsIgnoreCase(BLUE)){
         return new Blue();
      }
      return null;
   }
}