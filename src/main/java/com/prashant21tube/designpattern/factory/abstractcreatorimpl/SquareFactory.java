package com.prashant21tube.designpattern.factory.abstractcreatorimpl;

import com.prashant21tube.designpattern.factory.Shape;
import com.prashant21tube.designpattern.factory.Square;

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
public class SquareFactory extends AbstractShapeFactory {
    protected Shape factoryMethod() {
        return new Square();
    }
}
