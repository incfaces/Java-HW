package Block1;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 *
 * 4.     В переменной n хранится натуральное трёхзначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task4 {
    public static void sumAplusB(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int n = s.nextInt();
        int m = n;
        int sum = 0;
        while(n != 0){
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
