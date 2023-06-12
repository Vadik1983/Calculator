import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        UserInput userInput =new UserInput(a, b);
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число А: ");
            a = Integer.parseInt(scanner.nextLine());
            System.out.println("Введите число B: ");
            b = Integer.parseInt(scanner.nextLine());
            userInput.setNumberA(a);
            userInput.setNumberB(b);

        } catch (Throwable ignored) {
        }
        Actions actions = new Actions(a, b, '0');
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите действие: *, / , + , -");
            char x = scanner.next().charAt(0);
            actions.setX(x);

            System.out.println(actions.getResult());
        } catch (Throwable ignored) {
        }
    }
}
