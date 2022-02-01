package com.prashant21tube.designpattern.factory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 10/4/2020
 * Time: 12:58 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AnimalFactory {

    public Animal getAnimal(String animalType) {
        if ("DUCK".equals(animalType)) {
            return new Duck();
        } else if ("TIGER".equals(animalType)) {
            return new Tiger();
        }
        return null;
    }
}
