package de.ait.homework60;

import de.ait.threads.DemoThreadRunnable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTask implements Runnable{

    private static final Logger LOGGER = LoggerFactory.getLogger(MyTask.class);

    private Thread thread;

    private String nameThread;

    public MyTask(String nameThread) {
        this.nameThread = nameThread;
    }

    //Создайте класс MyTask, который реализует интерфейс Runnable и выполняет следующую задачу: в методе run(),
    // выведите на экран числа от 1 до 5 с задержкой 500 миллисекунд между числами.
    @Override
    public void run() {
        LOGGER.info("Thread {} start",nameThread);
        for (int i =1;i<6;i++){
            System.out.println("Число: "+i+ " в "+nameThread);
            LOGGER.info("Число {}, Thread: {}",i,nameThread);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(nameThread +"endet");
                LOGGER.error(nameThread +"endet");
            }

        }
        LOGGER.info("{} dead",nameThread);
    }
}
