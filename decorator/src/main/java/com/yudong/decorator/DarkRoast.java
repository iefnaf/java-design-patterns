package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:33
 **/
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.88;
    }
}
