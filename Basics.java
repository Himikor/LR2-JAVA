import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Basics {
    public static void main(String[] args) {
        int age = 20;
        double height = 175.5;
        String name = "Иван";
        boolean isStudent = true;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);

        int number1 = 15;
        int number2 = 4;
        double double1 = 10.5;
        double double2 = 2.5;

        System.out.println("Сложение: " + (number1 + number2));
        System.out.println("Вычитание: " + (number1 - number2));
        System.out.println("Умножение: " + (number1 * number2));
        System.out.println("Деление: " + (number1 / number2));
        System.out.println("Дробное деление: " + (double1 / double2));

        String firstName = "Иван";
        String lastName = "Петров";
        String fullName = firstName + " " + lastName;

        System.out.println("Полное имя: " + fullName);
        System.out.println("Длина имени: " + fullName.length());

        String str1 = "Java";
        String str2 = "java";
        System.out.println("Сравнение: " + str1.equals(str2));
        System.out.println("Сравнение без учета регистра: " + str1.equalsIgnoreCase(str2));

        inputAndFileOperations();
        bitwiseOperations();
    }

    public static void inputAndFileOperations() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            double difference = num1 - num2;
            double product = num1 * num2;
            double quotient = num1 / num2;

            try (PrintWriter writer = new PrintWriter("basics_output.txt")) {
                writer.println("Сумма: " + sum);
                writer.println("Разность: " + difference);
                writer.println("Произведение: " + product);
                writer.println("Частное: " + quotient);
            }

        } catch (Exception e) {
            System.out.println("Ошибка ввода");
        }
    }

    public static void bitwiseOperations() {
        int a = 109;
        int b = 17;
        int sum = a + b;

        System.out.println("109 в двоичной: " + Integer.toBinaryString(a));
        System.out.println("17 в двоичной: " + Integer.toBinaryString(b));
        System.out.println("Сумма в двоичной: " + Integer.toBinaryString(sum));

        int number = 42;
        int inverted = ~number;
        int cube = number * number * number;

        System.out.println("Число: " + number);
        System.out.println("Побитовое отрицание: " + inverted);
        System.out.println("В 3 степени: " + cube);

        int x = 5;
        int y = 3;
        System.out.println("5 & 3 = " + (x & y));
        System.out.println("5 | 3 = " + (x | y));
    }
}