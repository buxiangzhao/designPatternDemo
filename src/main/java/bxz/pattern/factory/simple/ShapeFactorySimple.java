package bxz.pattern.factory.simple;

import bxz.pattern.factory.simple.Circle;
import bxz.pattern.factory.simple.Rectangle;
import bxz.pattern.factory.simple.Square;
import bxz.pattern.factory.simple.Shape;

/**
 * 简单工厂模式
 *  静态工厂方式
 *  特点

 1 它是一个具体的类，非接口 抽象类。有一个重要的create()方法，利用if或者 switch创建产品并返回。
 2 create()方法通常是静态的，所以也称之为静态工厂。
 缺点
 1 扩展性差（我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法）
 2 不同的产品需要不同额外参数的时候 不支持
 */
public class ShapeFactorySimple {

   public static final String CIRCLE = "CIRCLE";//兰州拉面
   public static final String RECTANGLE = "RECTANGLE";//泡面
   public static final String SQUARE ="SQUARE";//干扣面

	//使用 getShape 方法获取形状类型的对象
   public static Shape getShape(String shapeType){
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
}