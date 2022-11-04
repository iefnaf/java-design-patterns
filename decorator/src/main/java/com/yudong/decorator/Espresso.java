package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:28
 **/
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
