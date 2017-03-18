package Block2;

/**
 * 1. Создайте программу, выводящую на экран все четырёхзначные числа
 * последовательности 1000 1003 1006 1009 1012 1015 ….
 */
public class Task11 {
    public static void main(String[] args) {
        int x=1000;
        while(x < 10000){
            System.out.println(x);
            x = x + 3;
        }
    }
}
