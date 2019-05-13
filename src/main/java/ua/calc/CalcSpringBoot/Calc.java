package ua.calc.CalcSpringBoot;

import ua.calc.CalcSpringBoot.calculator.Calculator;

public class Calc {

    private Calculator calculator;
    private final Boolean success;
    private int result;
    private String error;

    public Calc(Boolean success, int result) {
        this.success = true;
        getResult(new Calculator(3, 5, "plus")); // upd!!!
        this.result = this.calculator.getResult();
    }

    public Calc(Boolean success, String error) {
        this.success = false;
        this.error = this.calculator.getError();
    }

    public int getResult(Calculator c) {
        c.calculate();
        this.calculator = c;
        return calculator.getResult();
    }

    @Override
    public String toString() {
        return "Calc{" +
                "success=" + success +
                ", result=" + result +
                ", error=" + error +
                '}';
    }
}
/*
    "success": true,
    "result": 133

    Пример запроса: /calc?a=123&b=10&oper=plus
 */