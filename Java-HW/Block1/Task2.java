package Block1;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 2.     В переменной n хранится натуральное двузначное число.
 Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
 */
public class Task2 {
    public static void sumAplusB(){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите двухзначное число: ");
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
