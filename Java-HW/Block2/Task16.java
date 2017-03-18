package Block2;

import java.util.Scanner;

/**
 * 6.  Выведите на экран все положительные делители натурального числа, в
 *  ведённого пользователем с клавиатуры.
 */
public class Task16 {
    public static void main(String[] args) {

        int n;
        int count = 0;

        System.out.println("Введите натуральное число: ");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

            if(n < 1) {
            System.out.println("Введено не натуральное число");
            }

        System.out.print("Число " + n + " делится на: ");
            for(int i = 1; i <= n; i++){
                if ((n % i) == 0){
                    count++;
                    System.out.print(i + " ");
            }
        }
        System.out.println("\nКоличество делителей: " + count);
    }
}
