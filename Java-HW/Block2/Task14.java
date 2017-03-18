package Block2;

/**
 * 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Task14 {
    public static void main(String[] args) {
        int x = 2;
        for (int i = 1; i<=20; i++){
            System.out.println(i + ") " + x);
            x *=2;
        }
    }
}
