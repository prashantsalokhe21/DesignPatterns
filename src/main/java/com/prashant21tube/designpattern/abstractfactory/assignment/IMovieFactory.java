package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 2/7/2022
 * Time: 12:04 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IMovieFactory {
    IBollywoodMovie getBollywoodMovie();

    ITollywoodMovie getTollywoodMovie();

    IHollywoodMovie getHollywoodMovie();
}

class ComedyMovieFactory implements IMovieFactory {

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedy();
    }

    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedy();
    }

    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodComedy();
    }
}

class ActionMovieFactory implements IMovieFactory {

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodAction();
    }

    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodAction();
    }

    public IHollywoodMovie getHollywoodMovie() {
        return new HollywoodAction();
    }
}
