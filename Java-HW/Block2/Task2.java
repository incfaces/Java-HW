package Block2;

/**
 * 2. Создать программу, выводящую на экран случайно сгенерированное
 * трёхзначное натуральное число и его наибольшую цифру.

 Примеры работы программы:
 В числе 208 наибольшая цифра 8
 В числе 774 наибольшая цифра 7
 В числе 613 наибольшая цифра 6

 */
public class Task2 {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        int min = 100; // Минимальное число для диапазона
        int max = 999; // Максимальное число для диапазона
        int digit = 0;
        int x = rnd(min, max);
        int a = x;
        int m = -1;

        while (x !=0){
            digit = x%10;
            x = x/10;
            if (m < digit){
                m = digit;
            }
        }
        System.out.println("В числе " + a + " наибольшая цифра " + m);
        }


    }

