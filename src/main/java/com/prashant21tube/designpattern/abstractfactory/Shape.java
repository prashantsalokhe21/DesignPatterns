package com.prashant21tube.designpattern.abstractfactory;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory
 * <p>
 * User: Prashant Salokhe
 * Date: 2/2/2022
 * Time: 12:50 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle :: Draw method!");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square :: Draw method!");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle :: Draw method!");
    }
}
