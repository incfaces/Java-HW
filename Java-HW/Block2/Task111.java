package Block2;

/**
 * 11. В городе N есть большой склад на котором существует 50000 различных полок.
 * Для удобства работников руководство склада решило заказать для каждой полки табличку с номером от 00001 до 50000 в местной типографии,
 * но когда таблички напечатали, оказалось что печатный станок из-за неисправности не печатал цифру 2,
 * поэтому все таблички, в номерах которых содержалась одна или более двойка (например, 00002 или 20202) — надо перепечатывать.
 * Напишите программу, которая подсчитает сколько всего таких ошибочных табличек оказалось в бракованной партии.
 *
 * Ответ: Количество табличек: 23756
 */
public class Task111 {
    static int TabCount(int count) {
        int tab = 0;
        boolean isTwo = false;
        for (int i = 0; i <= count; i++) {
            int j = i;
            isTwo = false;
            while (j > 0) {
                if (j % 10 == 2) {
                    isTwo = true;
                    break;
                }
                j = j / 10;
            }
            if (isTwo)
                tab++;
        }
        return tab;
    }
    public static void main(String[] args) {
        System.out.println("Количество табличек: " + TabCount(50000));

    }
}
