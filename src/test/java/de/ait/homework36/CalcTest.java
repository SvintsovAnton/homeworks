package de.ait.homework36;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void makeOparationAdd() {
        Calc calculator = new Calc();
        Assertions.assertEquals(30,calculator.makeOparation(10,20,"add"));
    }

    @Test
    void makeOparationSubstruct() {
        Calc calculator = new Calc();
        Assertions.assertEquals(5,calculator.makeOparation(11,6,"substruct"));
    }
    @Test
    void makeOparationDivide() {
        Calc calculator = new Calc();
        Assertions.assertEquals(-1,calculator.makeOparation(10,5,"divide"));
    }


    @Test
    void testAddPrivateSuccess() throws Exception{
        Calc calculator = new Calc();
        Method privateMethod = Calc.class.getDeclaredMethod("add",int.class,int.class);
        privateMethod.setAccessible(true);
int result = (int)privateMethod.invoke(calculator,10,30);
Assertions.assertEquals(40,result);
    }
}