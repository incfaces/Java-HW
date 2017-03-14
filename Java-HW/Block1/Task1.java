package Block1;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.

 1.    В переменных q и w хранятся два натуральных числа.
        Создайте программу, выводящую на экран результат деления q на w с остатком.
        Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
 */

public class Task1 {
           public static void modOp(){
               Scanner s = new Scanner(System.in);
               System.out.println("Введите первое число: ");
               int q = s.nextInt();
               System.out.println("Введите второе число: ");
               int w = s.nextInt();
            System.out.println(q+" / "+w+" = "+(q/w)+" и "+(q%w)+" в остатке");
        }
        public static void main(String[] args){
            modOp();
        }
    }
