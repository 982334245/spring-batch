package com.batch.listener;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

/**
 * @ClassName ChunkStatefulListener
 * @Description: chunk 监听器
 * @Author longbao
 * @Date 2019/10/18
 * @Version V1.0
 **/
public class ChunkStatefulListener implements ChunkListener {
    @Override
    public void beforeChunk(ChunkContext chunkContext) {

    }

    @Override
    public void afterChunk(ChunkContext chunkContext) {

    }

    @Override
    public void afterChunkError(ChunkContext chunkContext) {

    }
}
