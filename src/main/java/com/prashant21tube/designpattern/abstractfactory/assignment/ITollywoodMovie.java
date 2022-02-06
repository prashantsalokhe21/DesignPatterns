package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 2/3/2022
 * Time: 12:35 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface ITollywoodMovie {
    String getMovieName();
}

class TollywoodAction implements ITollywoodMovie {

    public String getMovieName() {
        return "Pushpa - the rising";
    }
}

class TollywoodComedy implements ITollywoodMovie {

    public String getMovieName() {
        return "DJ";
    }
}
