package bxz.pattern.factory;

import bxz.pattern.factory.simple.Shape;
import bxz.pattern.factory.simple.ShapeFactorySimple;

/**
 * Created by SQ_BXZ on 2018-04-26.
 */
public class Test {

	public static void main(String[] args) {
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



}
