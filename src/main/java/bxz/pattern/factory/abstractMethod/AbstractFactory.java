package bxz.pattern.factory.abstractMethod;

import bxz.pattern.factory.simple.Shape;

public abstract class AbstractFactory {
   public  abstract Color getColor(String color);
   public  abstract Shape getShape(String shape) ;
}