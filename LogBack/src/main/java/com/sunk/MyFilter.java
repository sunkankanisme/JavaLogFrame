package com.sunk;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

public class MyFilter extends Filter<ILoggingEvent> {

    private String keyWord;

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        final String message = iLoggingEvent.getMessage();

        if (message.contains(keyWord)) {
            return FilterReply.ACCEPT;
        }

        return FilterReply.DENY;
    }
}
