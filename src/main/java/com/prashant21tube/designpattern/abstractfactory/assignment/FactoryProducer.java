package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 2/7/2022
 * Time: 12:37 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class FactoryProducer {

    public static IMovieFactory getFactory(String type) {
        if (type.equalsIgnoreCase("COMEDY")) {
            return new ComedyMovieFactory();
        } else if (type.equalsIgnoreCase("ACTION")) {
            return new ActionMovieFactory();
        }
        return null;
    }
}
