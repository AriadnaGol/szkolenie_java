package cyber.trainees.spotkania;

public class Loops {
    public void printNumbers(){
        for(int i = 1; i <= 100; i++) {
            if (i == 100) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
