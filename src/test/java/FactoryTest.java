import bxz.pattern.factory.abstractMethod.AbstractFactory;
import bxz.pattern.factory.abstractMethod.LinuxFactory;
import bxz.pattern.factory.abstractMethod.WindowsFactory;
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
		AbstractFactory linuxFactory = new LinuxFactory();
		linuxFactory.createButton().processEvent();
		linuxFactory.createText().getWholeText();

		AbstractFactory windowsFactory = new WindowsFactory();
		windowsFactory.createButton().processEvent();
		windowsFactory.createText().getWholeText();
	}


}
