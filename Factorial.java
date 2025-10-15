import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Ошибка: отрицательное число");
            return;
        }

        long factorial = calculateFactorial(number);
        System.out.println("Факториал: " + factorial);

        saveToFile(number, factorial);
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void saveToFile(int number, long factorial) {
        try (PrintWriter writer = new PrintWriter("factorial.txt")) {
            writer.println(factorial);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка файла");
        }
    }
}
