package cyber.trainees.homework.homework02;

import java.math.BigDecimal;

public class Addition {
    public String add(String text1, String text2) {
        return text1 + text2;
    }

    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public Double add(Double number1, Double number2) {
        return number1 + number2;
    }

    public BigDecimal add(BigDecimal number1, BigDecimal number2) {
        return number1.add(number2);
    }
}
