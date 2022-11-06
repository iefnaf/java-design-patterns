package com.yudong.factory;

/**
 * @author yudong
 * @since 2022/11/6 10:31
 **/
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 抽象工厂方法
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
