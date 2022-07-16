package cyber.trainees.spotkania;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public void printNumbers(){
        for(int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i + ".");
            } else {
                System.out.print(i + ", ");
            }
        }
    }

    public void printLetters() {
        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');
        for (int i = 0; i < letters.size(); i++) {
            System.out.print(letters.get(i));
            System.out.print(", ");

        }
    }

}
