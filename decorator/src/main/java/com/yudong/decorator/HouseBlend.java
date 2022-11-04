package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:28
 **/
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
