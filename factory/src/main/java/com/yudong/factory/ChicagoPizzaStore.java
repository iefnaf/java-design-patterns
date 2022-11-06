package com.yudong.factory;

/**
 * @author yudong
 * @since 2022/11/6 10:31
 **/
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        if ("cheese".equals(item)) {
            return new ChicagoStyleCheesePizza();
        } else if ("pepperoni".equals(item)) {
            return new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
    }
}
