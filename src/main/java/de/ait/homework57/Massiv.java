package de.ait.homework57;

public class Massiv {
    public static void main(String[] args) {
        //Создание и заполнение массива
        int[][] myArray = new int[5][5];

        try {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    int max = 100;
                    int min = 1;
                    myArray[i][j] = (int) (Math.random() * (max - min) + min);
                }
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("У вас ошибка, связанная с индексами массива провертье код или условия");
        }

        //Поиск максимального элемента:
        int maxInArray = 0;
        try {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if (maxInArray < myArray[i][j]) {
                        maxInArray = myArray[i][j];
                    }
                }
            }

            System.out.println("Максимальное числов в массиве: " + maxInArray);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("У вас ошибка, связанная с индексами массива провертье код или условия");
        }

        //Расчёт среднего значения:
        int sum = 0;
        int count = 0;
        int average = 0;
        try {
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    sum = sum + myArray[i][j];
                    count++;
                }
            }

            average = sum / count;
            System.out.println("Среднее значение: " + (average));
        } catch (ArithmeticException exception) {
            System.out.println("У вас ошибка, провертье код или условия");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("У вас ошибка, связанная с индексами массива провертье код или условия");
        }


        //Поиск чисел по условию

        try {
            System.out.print("Числа массива, которые больше срднего значения: ");
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    if (myArray[i][j] > average) {
                        System.out.print(" " + myArray[i][j]);
                    }
                }
            }
        } catch (ArithmeticException exception) {
            System.out.println("У вас ошибка, провертье код или условия");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("У вас ошибка, связанная с индексами массива провертье код или условия");
        }

    }

}


