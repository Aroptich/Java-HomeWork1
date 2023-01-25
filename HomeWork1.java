import java.util.ArrayList;
import java.util.Random;

public class ClassWork1 {
    public static final String reset = "\u001B[0m";
    public static final String yellow = "\u001B[33m";

    public static void main(String[] args) {
        ArrayList<Integer> m1 = new ArrayList<>();
        ArrayList<Integer> m2 = new ArrayList<>();

        Random random = new Random();
        int i = random.nextInt(2001);
        int i_count = i;
        System.out.println("Случайное число в диапазоне от 0 до 2000: " + yellow + i + reset);

        int n = 0;
        while (i_count != 0) {
            i_count >>= 1;
            n++;
        }
        String i_binary = Integer.toBinaryString(i);
        System.out.println("Номер старшего значащего бита: " + yellow + n + reset + "  (" + i_binary + ")");


        for (int k = i; k < Short.MAX_VALUE; k++) {
            if (k % n == 0) {
                m1.add(k);
            }
        }
        System.out.println(yellow + "Массив m1: " + reset + m1);

        for (int l = i; l > Short.MIN_VALUE; l--) {
            if (l % n == 0) {
                m2.add(l);
            }
        }
        System.out.println(yellow + "Массив m2: " + reset + m2);

    }
}
