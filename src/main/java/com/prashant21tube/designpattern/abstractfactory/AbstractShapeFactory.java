package com.prashant21tube.designpattern.abstractfactory;

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
}
