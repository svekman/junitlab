package se.iths.sven.junitlab;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {


    @BeforeAll
    static void startStartMeddelande(){
        System.out.println("Startar test av Calculator");
    }

    @Disabled
    //@AfterAll
    static void startAvslutMeddelande(){
        System.out.println("Test av Calculator slutfört");
    }


    @Test
    @DisplayName("Addition: 2+2=4?")
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiplikation: 2*3>5?")
    void testMultiply() {
        Calculator calculator = new Calculator();
        //assertEquals(4, calculator.multiply(2, 2));
        assertTrue(calculator.multiply(2,3)>5);
    }


    @RepeatedTest(3)
    @DisplayName("Division: 2/2=1?, testas 3ggr")
    void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.divide(2, 2));
    }


    @Test
    @DisplayName("Subtraktion: 2-2=0?")
    void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(2, 2));

    }

}
