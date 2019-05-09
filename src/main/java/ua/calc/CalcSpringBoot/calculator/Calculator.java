package ua.calc.CalcSpringBoot.calculator;

/**
 * Class Calculate.
 * Тестовое задание выполнение арифметических действий над двумя значениями.
 *
 * @autor alavrinenko.
 * @return int result.
 */
public class Calculator {
    /**
     * Результат вычисления.
     */
    private String oper;
    private int result;

    private String error;

    /**
     * Method plus.
     * Суммируем два значения.
     *
     * @param first  .
     * @param second .
     */
    public void calculate (int first, int second, String oper) {
        int res = 0;
        switch (oper){
            case ("plus"):
                res = first + second;
                break;

                case ("minus"):
                res = first - second;
                break;

                case ("divide"):
                    try {
                        res = first / second;
                    } catch (Exception e) {
                        e.printStackTrace();
                        res = 0;
                        setError("Operation 'wrong" + oper + "' is not supported");
                    }
                    break;

                case ("multiply"):
                res = first * second;
                break;
        }
        this.result = res;
    }

    public int getResult() {
        return this.result;
    }

    public String getOper() {
        return oper;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}