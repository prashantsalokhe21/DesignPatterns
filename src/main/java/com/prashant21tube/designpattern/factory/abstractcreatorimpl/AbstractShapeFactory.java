package com.prashant21tube.designpattern.factory.abstractcreatorimpl;

import com.prashant21tube.designpattern.factory.Circle;
import com.prashant21tube.designpattern.factory.Rectangle;
import com.prashant21tube.designpattern.factory.Shape;
import com.prashant21tube.designpattern.factory.Square;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory
 * <p>
 * User: Prashant Salokhe
 * Date: 10/3/2020
 * Time: 9:53 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    /**
     * Project: DesignPatterns
     * Package: com.prashant21tube.designpattern.abstractfactory
     * <p>
     * User: Prashant Salokhe
     * Date: 10/3/2020
     * Time: 10:02 PM
     * <p>
     * Created with IntelliJ IDEA
     * To change this template use File | Settings | File Templates.
     */
    public static class RectangleFactory extends AbstractShapeFactory {
        protected Shape factoryMethod() {
            return new Rectangle();
        }
    }

    /**
     * Project: DesignPatterns
     * Package: com.prashant21tube.designpattern.abstractfactory
     * <p>
     * User: Prashant Salokhe
     * Date: 10/3/2020
     * Time: 10:06 PM
     * <p>
     * Created with IntelliJ IDEA
     * To change this template use File | Settings | File Templates.
     */
    public static class CircleFactory extends AbstractShapeFactory {
        protected Shape factoryMethod() {
            return new Circle();
        }
    }

    /**
     * Project: DesignPatterns
     * Package: com.prashant21tube.designpattern.abstractfactory
     * <p>
     * User: Prashant Salokhe
     * Date: 10/3/2020
     * Time: 10:05 PM
     * <p>
     * Created with IntelliJ IDEA
     * To change this template use File | Settings | File Templates.
     */
    public static class SquareFactory extends AbstractShapeFactory {
        protected Shape factoryMethod() {
            return new Square();
        }
    }
}
