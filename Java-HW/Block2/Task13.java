package Block2;

/**
 * 3. Создайте программу, выводящую на экран все неотрицательные элементы
 * последовательности 90 85 80 75 70 65 60 ….
 */
public class Task13 {
    public static void main(String[] args) {
        int x = 90;
        while (x !=0){
            System.out.println(x);
            x -= 5;
        }
    }
}
