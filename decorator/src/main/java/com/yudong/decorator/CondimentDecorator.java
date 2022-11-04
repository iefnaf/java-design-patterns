package com.yudong.decorator;

/**
 * @author yudong
 * @since 2022/11/4 11:27
 **/
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
