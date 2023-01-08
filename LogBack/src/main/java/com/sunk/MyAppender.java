package com.sunk;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;
import ch.qos.logback.core.encoder.Encoder;

import java.nio.charset.StandardCharsets;

/*
 * 自定义 logback appender
 */
public class MyAppender<E> extends UnsynchronizedAppenderBase<E> {
    private Encoder encoder;

    public void setEncoder(Encoder encoder) {
        this.encoder = encoder;
    }

    @Override
    protected void append(E e) {
        byte[] bytes = this.encoder.encode(e);
        String s = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("MY-APPENDER: " + s);
    }
}
