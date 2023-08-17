package OOP_Seminar7_AW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ввод комплексных чисел от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число:");
        System.out.print("Действительная часть: ");
        double real1 = scanner.nextDouble();
        System.out.print("Мнимая часть: ");
        double imaginary1 = scanner.nextDouble();
        CompNum num1 = new CompNum(real1, imaginary1);

        System.out.println("Введите второе комплексное число:");
        System.out.print("Действительная часть: ");
        double real2 = scanner.nextDouble();
        System.out.print("Мнимая часть: ");
        double imaginary2 = scanner.nextDouble();
        CompNum num2 = new CompNum(real2, imaginary2);

        // Создание и вызов калькулятора
        Calc calculator = new Calc();
        calculator.performCalculations(num1, num2);

        scanner.close();
    }
}