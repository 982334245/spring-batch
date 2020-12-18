package com.batch.writer;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;

import java.util.List;

/**
 * @ClassName JdbcMessageHandler
 * @Description: TODO
 * @Author longbao
 * @Date 2020/9/10
 * @Version V1.0
 **/
public class JdbcMessageHandler implements MessageHandler {
    private static Log log = LogFactory.getLog(JdbcMessageHandler.class);
    public JdbcMessageHandler() {
    }
    @Override
    public void handleMessage(Message<?> message) throws MessagingException {
        Object obj = message.getPayload();
        //分别按照各种样式输出obj
        if(obj == null) {
            log.info("null");
        } else if(obj instanceof String) {
            log.info(obj);
        }else if(obj instanceof List) {
            List bean = (List)obj;
            log.info(bean);
        } else {
            log.info(ReflectionToStringBuilder.reflectionToString(message));
        }
    }
}
