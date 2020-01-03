package com.batch.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * @ClassName StepStatefulListener
 * @Description: step 监听器
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class StepStatefulListener implements StepExecutionListener{
    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("step=======开始");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("step=======结束");
        return null;
    }
}
