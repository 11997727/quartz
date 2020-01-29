package cn.kgc.tangcco.quartz.quartz;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

import java.text.ParseException;

/**
 * @program: quartz
 * @description: TODO
 * @author: cuihao
 * @create: 2020-01-12 20:30
 * @version: V1.0
 **/
public class Test {
    public static void main(String[] args) throws SchedulerException, ParseException {
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class).withIdentity("myJob").build();
       /* SimpleTriggerImpl simpleTrigger = new SimpleTriggerImpl("aaa");
        simpleTrigger.setStartTime(new Date(System.currentTimeMillis()+2000));
        simpleTrigger.setEndTime(new Date(System.currentTimeMillis()+20000));*/
        CronTriggerImpl cronTrigger = new CronTriggerImpl("t2","aaa","*/1 * * * * ?");
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.scheduleJob(jobDetail, cronTrigger);
        scheduler.start();
    }
}
