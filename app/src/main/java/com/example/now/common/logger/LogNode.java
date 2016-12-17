package com.example.now.common.logger;

/**
 * Created by Admin on 12/14/2016.
 */

public interface LogNode {

    public void println(int priority, String tag, String msg, Throwable tr);

}
