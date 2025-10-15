import java.util.Scanner;

public class Controls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел: " + sum);

        int stringCount = 0;
        String input;

        while (true) {
            input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input)) {
                break;
            }
            stringCount++;
        }

        System.out.println("Введено строк: " + stringCount);
        scanner.close();
    }
}