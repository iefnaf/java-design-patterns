package com.yudong.command;

/**
 * @author yudong
 * @since 2022/11/7 16:12
 **/
public interface Command {
    void execute();
    void undo();
}
