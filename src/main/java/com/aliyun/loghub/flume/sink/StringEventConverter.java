package com.aliyun.loghub.flume.sink;

import com.aliyun.openservices.log.common.LogItem;
import org.apache.flume.Context;
import org.apache.flume.Event;

import java.nio.charset.StandardCharsets;

public class StringEventConverter implements Converter<Event, LogItem> {


    @Override
    public void configure(Context context) {
        // No-op
    }

    @Override
    public LogItem convert(Event event) {
        LogItem item = new LogItem();
        item.PushBack("body", new String(event.getBody(), StandardCharsets.UTF_8));
        return item;
    }
}
