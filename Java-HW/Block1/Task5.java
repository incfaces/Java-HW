package Block1; /**
 * Created by user on 14.03.2017.
 * 5.     На поверхности Венеры человек окажется почти на 10% легче, чем на Земле.
 * Напишите программу, которая вычисляет введенный с клавиатуры вес на Венере.
 */
import java.util.Scanner;

public class Task5 {
    public static void imputw() {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите ваш вес:");
        double x = s.nextDouble();
        System.out.println("Ваш вес на Венере равен: " + (x - x * 0.1));
    }

    public static void main(String[] args) {
        imputw();
    }
}
