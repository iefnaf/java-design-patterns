package com.yudong.factory;

/**
 * @author yudong
 * @since 2022/11/6 10:31
 **/
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new NYStyleCheesePizza();
        } else if ("pepperoni".equals(item)) {
            return new NYStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
