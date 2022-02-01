package com.prashant21tube.designpattern.factory.concretecreatorimpl;

import com.prashant21tube.designpattern.factory.Shape;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.concretecreatorimpl
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:24 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ClientConcreteCreator {

    public static void main(String[] args) {
        //Get an object of Rectangle and call its Draw() method.    `
        Shape shape1 = new ShapeFactory().getShape("RECTANGLE");
        shape1.draw();

        //Get an object of Square and call its Draw() method.    `
        Shape shape2 = new ShapeFactory().getShape("SQUARE");
        shape2.draw();

        //Get an object of Circle and call its Draw() method.    `
        Shape shape3 = new ShapeFactory().getShape("CIRCLE");
        shape3.draw();
    }
}
