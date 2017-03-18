package Block2;

import java.util.Scanner;

/**
 * 5. Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
 */
public class Task15 {
    public static void MyFactorial(int x) {
        int res = 1;
        if (x < 0) {
            System.out.println("Число должно быть натуральным...");
        }
        else {
            for (int c = 1; c <= x; c++) {
                res = res * c;
            }
            System.out.println("Ответ: " + x + "! = " + res);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите натуральное число:");
        int digit = s.nextInt();
        MyFactorial(digit);
    }
}
