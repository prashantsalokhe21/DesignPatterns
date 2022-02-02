package com.prashant21tube.designpattern.abstractfactory;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory
 * <p>
 * User: Prashant Salokhe
 * Date: 2/2/2022
 * Time: 12:53 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface Color {
    void fill();
}

class Red implements Color {

    public void fill() {
        System.out.println("Inside Red :: fill method!");
    }
}

class Green implements Color {

    public void fill() {
        System.out.println("Inside Green :: fill method!");
    }
}

class Blue implements Color {

    public void fill() {
        System.out.println("Inside Blue :: fill method!");
    }
}