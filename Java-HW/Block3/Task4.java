package Block3;

/**
 * 4.  Разработать java-класс, задача которого генерация случайного регистрационного знака транспортного средства (ТС)
 * в формате: «М 000 ММ 55 или М 000 ММ 555», где
 0 и М - соответственно цифра и буква, означающие номер и серию регистрационного знака ТС;
 5 - цифра кода региона Российской Федерации, применяемых на регистрационных знаках ТС.
 (Государственный стандарт РФ ГОСТ Р 50577-93)
 */

public class Task4 {

    public static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        String letters = "АВЕКМНОРСТXУ0123456789";
        char[] symbols = new char[letters.length()];
        int i = 0;
        for (char letter : letters.toCharArray()) {
            symbols[i] = letter;
            i++;
        }
        System.out.print(symbols[rnd(0,11)] + " " + symbols[rnd(12,21)] + symbols[rnd(12,21)]+ symbols[rnd(12,21)]);
        System.out.print(" " + symbols[rnd(0,11)] + symbols[rnd(0,11)] + " " + symbols[rnd(12,21)] + symbols[rnd(11,21)]);
    }
}
