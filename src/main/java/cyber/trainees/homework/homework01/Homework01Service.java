package cyber.trainees.homework.homework01;

public class Homework01Service {
    public void printCalculations() {
        String message = "Hello world!";
        String message2 = "Hello" + " world!";
        System.out.println(message);
        System.out.println(message2);

        int a = 3;
        int b = 6;
        int c = a + b;
        System.out.println("a + b = " + c);
        c = a - b;
        System.out.println("a - b = " + c);
        c = b - a;
        System.out.println("b - a = " + c);
        System.out.println("a * b = " + multiply(a,b));
        System.out.println("a / b = " + divide(a,b));
        System.out.println("b / a = " + divide(b,a));
        double d = 9.13;
        double e = 15.98;
        System.out.println("d / e = " + divide(d,e));
        System.out.println("e / 0 = " + divide(e,0));
    }

    private static int multiply(int a, int b){
        return a * b;
    }

    private static double divide(int a, int b){
        return (double)a / (double)b;
    }

    private static double divide(double a, double b){
        return a / b;
    }
}
