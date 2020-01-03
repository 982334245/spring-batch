package com.batch.listener;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;

/**
 * @ClassName TaskletStatefulListener
 * @Description: tasklet 监听器 (有问题)
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
public class TaskletStatefulListener implements TaskListener{
    @Override
    public void started(TaskEvent e) {
        System.out.print("tasklet============开始");
    }

    @Override
    public void finished(TaskEvent e) {
        System.out.print("tasklet============结束");
    }
}
