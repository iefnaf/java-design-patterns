package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:25
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
