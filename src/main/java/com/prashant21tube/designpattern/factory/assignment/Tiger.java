package com.prashant21tube.designpattern.factory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:55 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Tiger implements Animal {
    public void talk() {
        System.out.println("Tiger says Roar Roar");
    }

    public void walk() {
        System.out.println("Tiger walks Fast");
    }
}
