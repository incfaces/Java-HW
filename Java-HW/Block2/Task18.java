package Block2;

import java.util.Scanner;

/**
 * 8.  Выведите на экран первые 11 членов последовательности Фибоначчи.
 * Напоминаем, что первый и второй члены последовательности равны единицам,
 * а каждый следующий — сумме двух предыдущих.
 */
public class Task18 {
    public static void main(String [] args){
        int n = 11;
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int sum = 2, i = 2;
        while (i < n) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
            i++;
        }
    }
}
