package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:54 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Duck implements Animal{

    public void talk() {
        System.out.println("Duck says Quak Quak");
    }

    public void walk() {
        System.out.println("Duck walks slow");
    }
}
