package de.ait.threads;

import de.ait.exceptions.CalculatorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoThreadRunnable implements  Runnable {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThreadRunnable.class);

    private Thread thread;

    private String threadName;


    public DemoThreadRunnable(String threadName) {
        this.threadName = threadName;
        LOGGER.info("Creating "+ threadName);
    }



    @Override
    public void run() {
LOGGER.info("Running "+threadName);
for (int i =4;i>0;i--){
    LOGGER.info("Thread: "+threadName+ ", {i}="+i);
    try {
        Thread.sleep(100);
        LOGGER.info("ThreadName: {} ,State: {}",threadName,thread.getState().name());
    } catch (InterruptedException e) {
        LOGGER.error("Thread {} was dead {}",threadName,e);
    }
}
LOGGER.info("Thread {} was dead {}",threadName);
    }


    public void start(){
        LOGGER.info("Start {}", threadName);{
            if (thread==null){
                thread= new Thread(this,threadName);
                thread.start();
            }
        }
    }
}
