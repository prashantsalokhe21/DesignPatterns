package com.prashant21tube.designpattern.factory.abstractcreatorimpl;

import com.prashant21tube.designpattern.factory.Circle;
import com.prashant21tube.designpattern.factory.Shape;

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
public class CircleFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Circle();
    }
}
