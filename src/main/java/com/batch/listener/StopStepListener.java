package com.batch.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.ItemReadListener;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * @ClassName StopStepListener
 * @Description: 作业终止拦截器
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class StopStepListener implements StepExecutionListener, ItemReadListener{
    private StepExecution stepExecution;

    @Override
    public void beforeStep(StepExecution stepExecution) {
        this.stepExecution = stepExecution;
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        return null;
    }

    @Override
    public void beforeRead() {
        /* 停止JOb */
        this.stepExecution.setTerminateOnly();
    }

    @Override
    public void afterRead(Object o) {

    }

    @Override
    public void onReadError(Exception e) {

    }
}
