package Block3;

/**
 * 3. Напишите программу, которая печатает массив, затем инвертирует
 * (то есть меняет местами первый элемент с последним, второй — с предпоследним и т.д.), и вновь печатает.
 */
public class Task3 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr1[] = new int[10];
        System.out.println("Исходный массив:");
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        int f = 0;
        for (int j = arr.length-1; j>=0; j--) {
            arr1[f] = arr[j];
            f++;
        }
        System.out.println("\nМассив после инвертирования:");
        for (int u = 0; u<arr1.length; u++) {
            System.out.print(arr1[u] + " ");
        }
    }
}
