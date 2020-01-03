package com.batch.processor;

import com.batch.bean.Test;
import org.springframework.batch.item.ItemProcessor;

/**
 * @ClassName ProcessorChunk
 * @Description: TODO
 * @Author longbao
 * @Date 2019/10/21
 * @Version V1.0
 **/
public class ProcessorChunk implements ItemProcessor<Test, Test> {
    @Override
    public Test process(Test test) throws Exception {
        return null;
    }
}
