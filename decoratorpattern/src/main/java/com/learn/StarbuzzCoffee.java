package com.learn;

public class StarbuzzCoffee {

    public static void main(String args []) {
       Beverage beverage = new Espresso();
       System.out.println(beverage.getDescription() + "$" + beverage.cost());
       
       Beverage b2 = new DarkRoast();
       b2 = new Mocha(b2);
       b2 = new Mocha(b2);
       b2 = new Whip(b2);
       System.out.println(b2.getDescription() + "$" + b2.cost());
    }
}
