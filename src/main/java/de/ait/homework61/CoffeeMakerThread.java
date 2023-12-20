package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMakerThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeMakerThread.class);

    @Override
    public void run(){
        System.out.println("Кофе мелется");
        LOGGER.info("Кофеварка мелит кофе");
        try {
            Thread.sleep(2000);
        System.out.println("Кофе заваривается");
        LOGGER.info("Кофеварка заваривает кофе");
        Thread.sleep(5000);
        System.out.println("Кофе готов");
        LOGGER.info("Кофе в кофеварке готово");
        Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Ошибка!");;
        }
    }

}
