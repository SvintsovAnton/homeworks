package de.ait.homework61;

public class PreparingDrinks {
    public static void main(String[] args) {


    BartenderThread bartenderThreadteablack = new BartenderThread("черный чай");
    BartenderThread bartenderThreadteagreen = new BartenderThread("зеленый чай");
    BartenderThread bartenderThreadcoctel = new BartenderThread("коктель");


    CoffeeMakerThread coffeeMakerThread = new CoffeeMakerThread();
    SommelierThread sommelierThread = new SommelierThread("Barón de Ley Reserva");
    SommelierThread sommelierThread2 = new SommelierThread("Palador Reserva");


    TeaMasterThread teaMasterThread1 = new TeaMasterThread("Demeter Kräutertee");
    TeaMasterThread teaMasterThread2 = new TeaMasterThread("Bio Waldbeere");


    bartenderThreadteablack.start();
    bartenderThreadteagreen.start();
    bartenderThreadcoctel.start();

    coffeeMakerThread.start();
    sommelierThread.start();
    sommelierThread2.start();

    teaMasterThread1.start();
    teaMasterThread2.start();


        try {
            bartenderThreadteablack.join();
            bartenderThreadteagreen.join();
            bartenderThreadcoctel.join();

            coffeeMakerThread.join();
            sommelierThread.join();
            sommelierThread2.join();

            teaMasterThread1.join();
            teaMasterThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
