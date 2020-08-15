import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        }
        else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Czy chcesz mnozenie czy dodawanie. wpiesz 'D' jako dodawanie, albo 'M' jako mnozenie");
        String answer = scanner.next();

        return !answer.toLowerCase().equals("d");
    }

    private double getArgument() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cyfre");
        return scanner.nextDouble();
    }
}