package com.batch.writer;

import com.batch.bean.CreditBill;
import com.batch.bean.Test;
import org.assertj.core.util.Compatibility;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * @ClassName WriterChunk
 * @Description: TODO
 * @Author longbao
 * @Date 2019/10/21
 * @Version V1.0
 **/
public class WriterChunk implements ItemWriter<CreditBill> {
    @Override
    public void write(List<? extends CreditBill> list) throws Exception {
        for (CreditBill cre: list) {
            System.out.println(cre);
        }
    }
}
