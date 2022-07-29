import cyber.trainees.homework.homework01.Homework01Service;
import cyber.trainees.homework.homework02.*;
import cyber.trainees.inheritance.Color;
import cyber.trainees.inheritance.Vehicle;
import cyber.trainees.inheritance.VehicleModel;
import cyber.trainees.wyjasnienia.Petle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Petle petle = new Petle();

        var numbers = new ArrayList<BigDecimal>();
        numbers.add(new BigDecimal(9));
        numbers.add(new BigDecimal(3));
        numbers.add(new BigDecimal(5));
        petle.displayAllElements(numbers);
    }
}


