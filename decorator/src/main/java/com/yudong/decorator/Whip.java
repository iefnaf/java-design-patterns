package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:35
 **/
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.13;
    }
}
