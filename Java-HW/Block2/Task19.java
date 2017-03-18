package Block2;

import java.util.Scanner;

/**
 * Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
 * (заранее не известно сколько цифр будет в числе).
 */
public class Task19 {
    public static void sumAplusB() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = s.nextInt();
        int m = n;
        int sum = 0;
        while (n != 0) {
            //Суммирование цифр числа
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("Сумма цифр числа " + m + " равна: " + sum);
    }
        public static void main(String[] args) {
            sumAplusB();
        }
}