package com.prashant21tube.designpattern.factory.concretecreatorimpl;

import com.prashant21tube.designpattern.factory.Circle;
import com.prashant21tube.designpattern.factory.Rectangle;
import com.prashant21tube.designpattern.factory.Shape;
import com.prashant21tube.designpattern.factory.Square;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.concretecreatorimpl
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:06 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
