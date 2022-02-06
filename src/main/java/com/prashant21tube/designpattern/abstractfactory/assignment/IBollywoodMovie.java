package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 2/2/2022
 * Time: 6:25 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IBollywoodMovie {
    String getMovieName();
}

class BollywoodAction implements IBollywoodMovie {

    public String getMovieName() {
        return "Bahubali";
    }
}

class BollywoodComedy implements IBollywoodMovie {

    public String getMovieName() {
        return "Andaz Apna Apna";
    }
}
