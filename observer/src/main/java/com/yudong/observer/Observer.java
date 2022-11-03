package com.yudong.observer;

/**
 * @author yudong
 * @since 2022/11/3 10:25
 **/
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
