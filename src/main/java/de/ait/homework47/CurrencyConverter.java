package de.ait.homework47;

import de.ait.exceptions.WrongArgumentsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverter.class);
        int summa;
        String currencyUSD = "USD";
        String currencyEUR = "EUR";
        String currency1;
        String currency2;
        boolean IsSuccessfulCompletion = true;


        System.out.println("Введите сумму для конвертации:");
        try {
            summa = scan.nextInt();
            System.out.println("Введите исходную валюту (USD, EUR):");
            currency1 = scan.next();
            System.out.println("Введите целевую валюту (USD, EUR):");
            currency2 = scan.next();
            if ((!currency1.equals(currencyEUR) && (!(currency1.equals(currencyUSD))))) {
                throw new WrongArgumentsException("Несуществующий код валюты.");
            }
            if ((!currency2.equals(currencyEUR) && (!(currency2.equals(currencyUSD))))) {
                throw new WrongArgumentsException("Несуществующий код валюты.");
            }
            if (currency1.equals(currency2)) {
                throw new WrongArgumentsException("Введены одинаковые валюты");
            }

            if (currency1.equals(currencyEUR)) {
                System.out.println(((double) summa) * 1.07);
            } else if (currency1.equals(currencyUSD)) {
                System.out.println((double) summa / 1.07);
            }

        } catch (InputMismatchException exception) {
            IsSuccessfulCompletion = false;
            System.out.println("Введено не числовое значение.");
            LOGGER.error("Введено не числовое значение: " + exception);

        } catch (WrongArgumentsException exception) {
            IsSuccessfulCompletion = false;
            System.out.println(exception.getMessage());
            LOGGER.error(exception.getMessage());
        } finally {
            if (IsSuccessfulCompletion) {
                System.out.println("Операция конвертации завершена.");
            }
        }
    }

}
