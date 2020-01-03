package com.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * @ClassName JobStatefulListener
 * @Description: job 监听器
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class JobStatefulListener implements JobExecutionListener{
    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("job=======开始");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("job=======结束");
    }
}
