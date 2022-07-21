package calculator;

import java.util.HashMap;
import java.util.Map;

public class CalculatorFull {
    enum Option {
        MULTIPLY,
        DIVISION,
        POWER
    }

    public int calculatorFull(int first, int second, String optionName) throws IllegalArgumentException {
        Option option = this.stringToOption(optionName);
        if (option == Option.MULTIPLY)
            return this.multiply(first, second);
        else if (option == Option.DIVISION)
            return this.division(first, second);
        return this.power(first, second);
    }

    private Option stringToOption(String option) throws IllegalArgumentException {
        Map<String, Option> map = new HashMap<String, Option>() {{
            put("*", Option.MULTIPLY);
            put("/", Option.DIVISION);
            put("^", Option.POWER);
        }};
        return map.get(option);
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        return a / b;
    }

    private int power(int a, int b) {
        int result = a;
        for (int i = 0; i < b - 1; i++) {
            result = this.multiply(result, a);
        }
        return result;
    }
}
