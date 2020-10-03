package com.prashant21tube.designpattern.abstractfactory;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern
 * <p>
 * User: Prashant Salokhe
 * Date: 10/3/2020
 * Time: 9:46 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Circle implements Shape {
    public void draw() {
        System.out.println("Inside Circle :: draw() method.");
    }
}
