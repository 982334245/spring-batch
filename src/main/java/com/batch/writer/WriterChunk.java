package com.batch.writer;

import com.batch.bean.Test;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @ClassName WriterChunk
 * @Description: TODO
 * @Author longbao
 * @Date 2019/10/21
 * @Version V1.0
 **/
public class WriterChunk implements ItemWriter<Test> {
    @Override
    public void write(List<? extends Test> list) throws Exception {

    }
}
