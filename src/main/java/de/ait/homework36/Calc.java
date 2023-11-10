package de.ait.homework36;

public class Calc {

    private int add(int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }

    private int substract(int numberOne, int numberTwo){
        return numberOne-numberTwo;
    }


    public int makeOparation(int numberOne, int numberTwo, String oparation)
    {int result=0;

    switch (oparation){
        case "add" ->
            result = add(numberOne,numberTwo);
        case "substruct" ->
            result= substract(numberOne, numberTwo);
        default -> {
            System.out.println("ERROR");
            result= -1;
        }

    }
        return result;
    }

}
