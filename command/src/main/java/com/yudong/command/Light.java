package com.yudong.command;

/**
 * @author yudong
 * @since 2022/11/7 16:21
 **/
public class Light {
    String room;
    public Light(String room) {
        this.room = room;
    }
    public void on() {
        System.out.println("turn on the light in " + room);
    }

    public void off() {
        System.out.println("turn off the light in " + room);
    }
}
