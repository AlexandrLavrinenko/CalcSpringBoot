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
    private int first, second;
    private String oper;
    private int result;

    /**
     * Конструктор.
     *
     * @param first  .
     * @param second .
     * @param oper .
     */
    public Calculator(int first, int second, String oper) {
        this.first = first;
        this.second = second;
        this.oper = oper;
    }

    private String error;

    /**
     * Method calculate.
     * Выполняем операции над значениями.
     */
    public void calculate () {
        int first = getFirst();
        int second = getSecond();
        String oper = getOper();
        int res = 0;
        setOper(oper);
        switch (oper){
            case ("plus"):
                try {
                    res = first + second;
                } catch (Exception e) {
                    e.printStackTrace();
                    setError(oper);
                }
                break;

                case ("minus"):
                    try {
                        res = first - second;
                    } catch (Exception e) {
                        e.printStackTrace();
                        setError(oper);
                    }
                    break;

                case ("divide"):
                    try {
                        res = first / second;
                    } catch (Exception e) {
                        e.printStackTrace();
                        res = 0;
                        setError(oper);
                    }
                    break;

                case ("multiply"):
                    try {
                        res = first * second;
                    } catch (Exception e) {
                        e.printStackTrace();
                        setError(oper);
                    }
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

    public void setOper(String oper) {
        this.oper = oper;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public String getError() {
        return error;
    }

    public void setError(String oper) {
        StringBuilder stB = new StringBuilder("Operation 'wrong");
        stB.append(oper);
        stB.append("' is not supported");
        this.error = stB.toString();
    }
}