package Block3;

/**
 * 1. Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 * Вывести массив на экран.
 */
public class Task1 {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        int[][] numbers = new int[8][5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rnd(10,99);
                System.out.print(numbers[i][j] + " ");
            }
        }
    }
}

