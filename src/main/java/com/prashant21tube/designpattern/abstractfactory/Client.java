package com.prashant21tube.designpattern.abstractfactory;

/**
 * Project: DesignPatterns
 * Package: com.prashant21tube.designpattern.abstractfactory
 * <p>
 * User: Prashant Salokhe
 * Date: 10/3/2020
 * Time: 10:07 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    public static void main(String[] args) {
        //Get object of Rectangle and call its Draw() method.
        Shape s1 = new RectangleFactory().getShape();
        s1.draw();

        //Get object of Circle and call its Draw() method.
        Shape s2 = new CircleFactory().getShape();
        s2.draw();

        //Get object of Square and call its Draw() method.
        Shape s3 = new SquareFactory().getShape();
        s3.draw();
    }
}
