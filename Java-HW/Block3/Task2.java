package Block3;

/**
 * 2. Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99].
 * Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (
 * его индекс не имеет значения).
 */

public class Task2 {
    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        int[][] numbers = new int[5][8];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = rnd(-99, 99);
                System.out.print(numbers[i][j] + " ");
            }
        }
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (max < numbers[i][j]) {
                    max = numbers[i][j];
                }
            }
        }
        System.out.println("\n");
        System.out.println("Максимальный элемент массива = " + max);
    }
}
