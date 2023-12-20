package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeaMasterThread extends Thread{

    private static final Logger LOGGER = LoggerFactory.getLogger(TeaMasterThread.class);

    private String teaName;

    public TeaMasterThread(String teaName) {
        this.teaName = teaName;
    }

    @Override
    public void run(){
        System.out.println("Завариваю чай: "+teaName);
        LOGGER.info("Чайный мастер заваривает чай - {}",teaName);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Ошибка!");
        }
        System.out.println("Чай готов");
        LOGGER.info("Чайный мастер приготовил чай");

    }
}
