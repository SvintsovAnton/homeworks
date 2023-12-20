package de.ait.homework61;

import de.ait.homework46.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread extends Thread{

    private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread.class);


    private String drink;

    public BartenderThread(String drink) {
        this.drink = drink;
    }

    @Override
    public void run(){
        System.out.println("Готовлю "+drink);
        LOGGER.info("Бармэн готовит {}",drink);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(drink+" готов");
        LOGGER.info("Бармэн приготовил {}",drink);
    }
}
