package quartz;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by longbao on 18/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/spring.xml"})
public class JUnitTest {
    @Autowired
    private JobLauncher jobLauncher;
    @Autowired@Qualifier("myJob")
    private Job job;

    @Test
    public void DemoApplication() throws Exception{
        JobParametersBuilder jobParameters = new JobParametersBuilder();
        jobParameters.addDate("transDate", new Date());
        JobExecution jobExecution = jobLauncher.run(job, jobParameters.toJobParameters());
        System.out.print(jobExecution.toString());
    }
}
