package com.batch.controller;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @ClassName JobLauncherController
 * @Description: HTTP请求处理控制中心
 * @Author longbao
 * @Date 2019/10/17
 * @Version V1.0
 **/
@RequestMapping("/batch")
@Controller
public class JobLauncherController{
    private static final String JOB_NAME = "jobName";
    private JobLauncher jobLauncher;
    private JobRegistry jobRegistry;

    public JobLauncherController(JobLauncher jobLauncher,JobRegistry jobRegistry){
        this.jobLauncher = jobLauncher;
        this.jobRegistry = jobRegistry;
    }

    @RequestMapping(value = "/executeJob", method = RequestMethod.GET)
    public void launcher(@RequestParam String jobName, HttpServletRequest request) throws Exception{
        JobParameters jobParameters = bulidParameters(request);
        jobLauncher.run(jobRegistry.getJob(jobName), jobParameters);
    }

    /**
     * @MethodName: bulidParameters
     * @Description: 将HTTP请求参数转换为作业参数
     * @Param: [request]
     * @Return: org.springframework.batch.core.JobParameters
     * @Author: longbao
     * @Date:
     */
    private JobParameters bulidParameters(HttpServletRequest request) {
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()){
            String paramName = paramNames.nextElement();
            if (!JOB_NAME.equals(paramName)){
                jobParametersBuilder.addString(paramName, request.getParameter(paramName));
            }
        }
        return jobParametersBuilder.toJobParameters();
    }
}
