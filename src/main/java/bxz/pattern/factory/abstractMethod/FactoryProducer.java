package bxz.pattern.factory.abstractMethod;

public class FactoryProducer {

   public static final String SHAPE = "SHAPE";
   public static final String COLOR ="COLOR";


   public static AbstractFactory getFactory(String choice){
	   if(choice.equalsIgnoreCase(SHAPE)){
         return new ShapeFactory();
      } else if(choice.equalsIgnoreCase(COLOR)){
         return new ColorFactory();
      }
      return null;
   }
}