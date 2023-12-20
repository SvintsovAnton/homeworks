package de.ait.threads;

import de.ait.homework60.MyTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoThreadExtends extends Thread{

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThreadExtends.class);
    private Thread thread;

    private String threadname;


    public DemoThreadExtends(String name) {
        super(name);
        this.threadname = name;
        LOGGER.info("Creating {}"+threadname);
    }

    public void run(){
        LOGGER.info("Running "+threadname);
        for (int i =4;i>0;i--){
            LOGGER.info("Thread: "+threadname+ ", {i}="+i);
            try {
                Thread.sleep(100);
                LOGGER.info("ThreadName: {} ,State: {}",threadname,thread.getState().name());
            } catch (InterruptedException e) {
                LOGGER.error("Thread {} was dead {}",threadname,e);
            }
        }
        LOGGER.info("Thread {} was dead {}",threadname);
    }

    public void start(){
        LOGGER.info("Start {} ",threadname);
        if (thread ==null){
            thread= new Thread(this,threadname);
        }
    }
}
