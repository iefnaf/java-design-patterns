package com.yudong.command;

/**
 * @author yudong
 * @since 2022/11/7 16:21
 **/
public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("turn on the stereo in " + room);
    }

    public void setCd() {
        System.out.println("set CD");
    }

    public void setVolume(int volume) {
        System.out.println("set volume to " + volume);
    }

    public void off() {
        System.out.println("turn off the stereo in " + room);
    }
}
