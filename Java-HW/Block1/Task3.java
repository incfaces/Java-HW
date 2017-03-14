package Block1;

import java.util.Scanner;

/**
 * Created by user on 14.03.2017.
 *
 * 3.     В переменной n хранится вещественное число с ненулевой дробной частью.
 * Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
 */
public class Task3 {
    public static void myround () {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите вещественное число: ");
        double n = s.nextDouble();
        System.out.println("Результат округления равен: " + Math.round(n));
    }

    public static void main(String[] args) {
        myround();
    }
}
