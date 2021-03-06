package com.zero.stream.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * 接收来自RabbitMQ消息的消费者SinkReceiver
 * @author jianqing.li
 * @date 2018/5/11
 */
@EnableBinding(Sink.class)
public class SinkReceiver {
    private static Logger logger = LoggerFactory.getLogger(SinkReceiver.class);

    /**
     * 事件监听器
     * @param payload
     */
    @StreamListener(Sink.INPUT)
    public void receive(Object payload) {
        logger.info("Received: {}", payload);
    }
}
