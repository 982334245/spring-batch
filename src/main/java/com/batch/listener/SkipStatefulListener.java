package com.batch.listener;

import org.springframework.batch.core.SkipListener;

/**
 * @ClassName SkipStatefulListener
 * @Description: 异常跳过处理监听类
 * @Author longbao
 * @Date 2019/10/21
 * @Version V1.0
 **/
public class SkipStatefulListener implements SkipListener {
    @Override
    public void onSkipInRead(Throwable throwable) {

    }

    @Override
    public void onSkipInWrite(Object o, Throwable throwable) {

    }

    @Override
    public void onSkipInProcess(Object o, Throwable throwable) {

    }
}
