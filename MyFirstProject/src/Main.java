public class Main {
    public static void main(String[] args) {
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
    }

    private static int multiply(int a, int b){
        return a * b;
    }

    private static double divide(int a, int b){
        return (double)a / (double)b;
    }
}
