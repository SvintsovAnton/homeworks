package de.ait.threads;

public class ThreadDemoCounter extends Thread {
    private Thread thread;
    private String threadname;

    CounterPrinter counterPrinter;

    public ThreadDemoCounter(String threadname, CounterPrinter counterPrinter) {
        this.threadname = threadname;
        this.counterPrinter = counterPrinter;
    }

    public void run(){
        synchronized (counterPrinter){
            System.out.print(threadname+"-->");
        counterPrinter.print();}
        System.out.println("Thread-->"+threadname+" is done");
    }

    public void start(){
        System.out.println("Start thread "+ threadname);
        if (thread==null){
            thread= new Thread(this,threadname);
            thread.start();
        }

    }

}
