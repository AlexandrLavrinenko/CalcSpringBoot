package ua.calc.CalcSpringBoot.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenTenPlusTenThenTwenty() {
        Calculator calc = new Calculator(10, 10, "plus");
        calc.calculate();
        int result = calc.getResult();
        int expected = 20;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTenMinusFiveThenFive() {
        Calculator calc = new Calculator(10, 5, "minus");
        calc.calculate();
        int result = calc.getResult();
        int expected = 5;
        assertThat(result, is(expected));
    }

    @Test
    public void whenTwelweDivideTwoThenSix() {
        Calculator calc = new Calculator(12, 2, "divide");
        calc.calculate();
        int result = calc.getResult();
        int expected = 6;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSevenMultiplyFourThenTwentyEight() {
        Calculator calc = new Calculator(7, 4, "multiply");
        calc.calculate();
        int result = calc.getResult();
        int expected = 28;
        assertThat(result, is(expected));
    }

    @Test
    public void whenEightDivideZeroThenErrZeroPartOne() {
        Calculator calc = new Calculator(8, 0, "divide");
        calc.calculate();
        int result = calc.getResult();
        int expected = 0;
        assertThat(result, is(expected));
    }

    @Test
    public void whenEightDivideZeroThenErrZeroPartTwo() {
        Calculator calc = new Calculator(8, 0, "divide");
        calc.calculate();
        int result = calc.getResult();
        String errorTxt = calc.getError();
        String expected = "Operation 'wrongdivide' is not supported";
        assertThat(errorTxt, is(expected));
    }
}