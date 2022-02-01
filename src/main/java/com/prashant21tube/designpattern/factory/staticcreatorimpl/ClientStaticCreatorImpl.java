package com.prashant21tube.designpattern.factory.staticcreatorimpl;

import com.prashant21tube.designpattern.factory.Shape;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.staticcreatorimpl
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:43 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ClientStaticCreatorImpl {

    public static void main(String[] args) {
        //Get an object of Rectangle and call its draw() method.
        Shape shape1 = ShapeFactory.getShape("RECTANGLE");
        shape1.draw();

        //Get an object of Square and call its draw() method.
        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();

        //Get an object of Circle and call its draw() method.
        Shape shape3 = ShapeFactory.getShape("CIRCLE");
        shape3.draw();
    }
}
