package com.prashant21tube.designpattern.factory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 1:09 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ClientAssignment {

    public static void main(String[] args) {
        Animal animal1 = new AnimalFactory().getAnimal("TIGER");
        animal1.talk();
        animal1.walk();

        Animal animal2 = new AnimalFactory().getAnimal("DUCK");
        animal2.talk();
        animal2.walk();
    }
}
