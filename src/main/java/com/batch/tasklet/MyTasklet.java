package com.batch.tasklet;

import com.batch.service.redis.RedisService;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * TODO
 * @Author lb
 * @Date 17:19 18/7/12
 * @Param
 * @return
 **/
public class MyTasklet implements Tasklet {

    @Autowired
    private RedisService redisService;

//    private DataSource dataSource;
//
//    public DataSource getDataSource() {
//        return dataSource;
//    }
//
//    public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("task");
        Thread.sleep(1000*3);   // 休眠3秒
//        for (int i = 0; i < 10000; i++) {
//            System.out.println("task11====" + i);
//        }
        redisService.setnx("aaa", "bbb", 100);
        return RepeatStatus.FINISHED;
    }
}
