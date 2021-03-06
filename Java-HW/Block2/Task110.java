package Block2;

/**
 * 10. В городе N проезд в трамвае осуществляется по бумажным отрывным билетам.
 * Каждую неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 000001 до 999999.
 * «Счастливым» считается билетик у которого сумма первых трёх цифр номера равна сумме последних трёх цифр,
 * как, например, в билетах с номерами 003102 или 567576.
 * Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь раздумывает,
 * как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 *
 * Ответ: Количество счастливых билетов: 55251
 */
public class Task110 {

    public static void main(String[] args) {
        int a, b;
        int count = 0;
        int i = 1000;

        while (i <= 999999) {
            a = i / 1000;
            b = i % 1000;

            int sumA = 0;
            while (a != 0) {
                sumA = sumA + (a % 10);
                a = a / 10;
            }
            int sumB = 0;
            while (b != 0) {
                sumB = sumB + (b % 10);
                b = b / 10;
            }

            if (sumA == sumB) {
                count = count + 1;
            }
            i++;
        }
        System.out.println("Количество счастливых билетов: " + count);
    }
}

