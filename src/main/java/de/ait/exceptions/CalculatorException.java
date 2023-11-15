package de.ait.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorException {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculatorException.class);
    public int divide (String numberOne,int numberTwo){

       try{
           int numberOneInt = Integer.parseInt(numberOne);
        return numberOneInt/numberTwo;
    }
    catch (ArithmeticException exception){
           LOGGER.error("Divide by 0",exception.getMessage());
           throw  new WrongArgumentsException("Divide by 0");
    }
    catch (NumberFormatException exception){
    LOGGER.error("Wrong format, not number in String",numberOne);
    throw  new WrongArgumentsException("Wrong format, not number in String");
       }
}}
