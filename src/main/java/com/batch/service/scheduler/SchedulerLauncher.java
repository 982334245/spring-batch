package com.batch.service.scheduler;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

import java.util.Date;


public class SchedulerLauncher {
    private Job job;
    private JobLauncher jobLauncher;

    public void launcher() throws Exception {
        JobParameters jobParameters = createJobParameters();
        jobLauncher.run(job, jobParameters);
    }


    private JobParameters createJobParameters(){
        JobParameters jobParameters = new JobParametersBuilder().addDate("executeDate", new Date()).toJobParameters();
        return jobParameters;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public JobLauncher getJobLauncher() {
        return jobLauncher;
    }

    public void setJobLauncher(JobLauncher jobLauncher) {
        this.jobLauncher = jobLauncher;
    }
}
