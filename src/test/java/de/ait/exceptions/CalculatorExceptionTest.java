package de.ait.exceptions;

import nl.altindag.log.LogCaptor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorExceptionTest {

    private LogCaptor logCaptor = LogCaptor.forClass(CalculatorException.class);

    @Test
    void testDivideByZeroThrowsArithmeticException(){
        CalculatorException calculatorException = new CalculatorException();
        Assertions.assertThrows(WrongArgumentsException.class,() ->calculatorException.divide("30",0));


    }

    @Test
    void testDivideSuccess(){
        CalculatorException calculatorException = new CalculatorException();
        Assertions.assertEquals(3,calculatorException.divide("90",30));
    }

    @Test
    void testDivideByZeroThrowsArithmeticExceptionCheckLOg(){
        logCaptor.setLogLevelToInfo();
        CalculatorException calculatorException = new CalculatorException();
        String expectedInfoMessage = "Divide by 0";
        Assertions.assertThrows(WrongArgumentsException.class,() ->calculatorException.divide("30",0));
        Assertions.assertTrue(logCaptor.getErrorLogs().contains(expectedInfoMessage));
    }

    @Test
    void testDivideByZeroThrowsNumbersFormat(){
        CalculatorException calculatorException = new CalculatorException();
        Assertions.assertThrows(WrongArgumentsException.class,() ->calculatorException.divide("30A",0));


    }

    @Test
    void testDivideByZeroThrowsNumberFormatExceptionCheckLOg(){
        logCaptor.setLogLevelToInfo();
        CalculatorException calculatorException = new CalculatorException();
        String expectedInfoMessage = "Wrong format, not number in String";
        Assertions.assertThrows(WrongArgumentsException.class,() ->calculatorException.divide("30D",20));
        Assertions.assertTrue(logCaptor.getErrorLogs().contains(expectedInfoMessage));
    }


}