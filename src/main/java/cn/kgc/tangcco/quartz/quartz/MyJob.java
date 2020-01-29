package cn.kgc.tangcco.quartz.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @program: quartz
 * @description: TODO
 * @author: cuihao
 * @create: 2020-01-12 20:29
 * @version: V1.0
 **/
public class MyJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("这是要做的事情");
    }
}
