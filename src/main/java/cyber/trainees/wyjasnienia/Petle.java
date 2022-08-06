package cyber.trainees.wyjasnienia;

import cyber.trainees.homework.homework02.Calculator;

import java.math.BigDecimal;
import java.util.List;

public class Petle {
    public void displayAllElements(List<BigDecimal> numbers) {
        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
            sum = sum.add(numbers.get(i));
        }

        System.out.println("Suma liczb: " + sum);
    }
}
