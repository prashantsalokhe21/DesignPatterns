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
public class Client {
    public static void main(String[] args) {
        IMovieFactory movieFactoryC = FactoryProducer.getFactory("COMEDY");

        IBollywoodMovie bComedy = movieFactoryC.getBollywoodMovie();
        ITollywoodMovie tComedy = movieFactoryC.getTollywoodMovie();
        IHollywoodMovie hComedy = movieFactoryC.getHollywoodMovie();

        System.out.println(bComedy.getMovieName());
        System.out.println(tComedy.getMovieName());
        System.out.println(hComedy.getMovieName());

        IMovieFactory movieFactoryA = FactoryProducer.getFactory("ACTION");

        IBollywoodMovie bAction = movieFactoryA.getBollywoodMovie();
        ITollywoodMovie tAction = movieFactoryA.getTollywoodMovie();
        IHollywoodMovie hAction = movieFactoryA.getHollywoodMovie();

        System.out.println(bAction.getMovieName());
        System.out.println(tAction.getMovieName());
        System.out.println(hAction.getMovieName());
    }

}
