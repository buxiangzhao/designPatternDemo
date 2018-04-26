import bxz.pattern.factory.abstractMethod.AbstractFactory;
import bxz.pattern.factory.abstractMethod.Color;
import bxz.pattern.factory.abstractMethod.FactoryProducer;
import bxz.pattern.factory.factoryMethod.CircleFactory;
import bxz.pattern.factory.factoryMethod.RectangleFactory;
import bxz.pattern.factory.factoryMethod.ShapeFactory;
import bxz.pattern.factory.factoryMethod.SquareFactory;
import bxz.pattern.factory.simple.Shape;
import bxz.pattern.factory.simple.ShapeFactorySimple;
import org.junit.Test;

/**
 * Created by SQ_BXZ on 2018-04-26.
 */
public class FactoryTest {

	@Test
	public  void simpleFactory() {
		//获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = ShapeFactorySimple.getShape(ShapeFactorySimple.CIRCLE);
		//调用 Circle 的 draw 方法
		shape1.draw();
		//获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = ShapeFactorySimple.getShape(ShapeFactorySimple.RECTANGLE);
		//调用 Rectangle 的 draw 方法
		shape2.draw();
		//获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = ShapeFactorySimple.getShape(ShapeFactorySimple.SQUARE);
		//调用 Square 的 draw 方法
		shape3.draw();
	}


	@Test
	public  void factoryMethod() {
		ShapeFactory circleFactory = new CircleFactory();
		circleFactory.getShape().draw();
		ShapeFactory rectangleFactory = new RectangleFactory();
		rectangleFactory.getShape().draw();
		ShapeFactory squareFactory = new SquareFactory();
		squareFactory.getShape().draw();

	}

	@Test
	public  void abstractMethod() {

		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		//获取形状为 Circle 的对象
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		//调用 Circle 的 draw 方法
		shape1.draw();

		//获取形状为 Rectangle 的对象
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		//调用 Rectangle 的 draw 方法
		shape2.draw();

		//获取形状为 Square 的对象
		Shape shape3 = shapeFactory.getShape("SQUARE");

		//调用 Square 的 draw 方法
		shape3.draw();

		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

		//获取颜色为 Red 的对象
		Color color1 = colorFactory.getColor("RED");

		//调用 Red 的 fill 方法
		color1.fill();

		//获取颜色为 Green 的对象
		Color color2 = colorFactory.getColor("Green");

		//调用 Green 的 fill 方法
		color2.fill();

		//获取颜色为 Blue 的对象
		Color color3 = colorFactory.getColor("BLUE");

		//调用 Blue 的 fill 方法
		color3.fill();

	}


}
