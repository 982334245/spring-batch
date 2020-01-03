package com.batch.listener;

import javax.batch.api.chunk.listener.ItemWriteListener;
import java.util.List;

/**
 * @ClassName WriterStatefulListener
 * @Description: writer 监听器
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class WriterStatefulListener implements ItemWriteListener{
    @Override
    public void beforeWrite(List<Object> list) throws Exception {

    }

    @Override
    public void afterWrite(List<Object> list) throws Exception {

    }

    @Override
    public void onWriteError(List<Object> list, Exception e) throws Exception {

    }
}
