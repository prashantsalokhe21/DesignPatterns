package com.prashant21tube.designpattern.abstractfactory;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern
 * <p>
 * User: Prashant Salokhe
 * Date: 10/3/2020
 * Time: 9:47 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Rectangle implements Shape {
    public void draw() {
        System.out.println("Inside Rectangle :: draw() method.");
    }
}
