package com.yudong.observer;

/**
 * @author yudong
 * @since 2022/11/3 10:24
 **/
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
