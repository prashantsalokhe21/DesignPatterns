package com.prashant21tube.designpattern.abstractfactory.assignment;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory.assignment
 * <p>
 * User: Prashant Salokhe
 * Date: 2/2/2022
 * Time: 6:18 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IHollywoodMovie {
    String getMovieName();
}

class HollywoodAction implements IHollywoodMovie {


    public String getMovieName() {
        return "True Life";
    }
}

class HollywoodComedy implements IHollywoodMovie {


    public String getMovieName() {
        return "The Mask";
    }
}
