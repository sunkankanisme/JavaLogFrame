package com.sunk;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger logger = (Logger) LoggerFactory.getLogger(App.class);
        /*
         * logback 中的日志级别
         * TRACE < DEBUG < INFO < WARN < ERROR
         */
        logger.trace("Hello world");
        logger.debug("Hello world");
        logger.info("Hello world");
        logger.warn("Hello world");
        logger.error("Hello world");

    }
}
