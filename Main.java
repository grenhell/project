import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("введите выражение через пробел");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int a = 0;
        int b = 0;
        int n = 0;
        int m = 0;
        int result = 1;
        String[] vvodmass = input.split(" ");
        String dictionary = "0, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, XIII, XIV, XV, XVI, XVII, XVIII, XIX, XX, XXI, XXII, XXIII, XXIV, XXV, XXVI, XXVII, XXVIII, XXIX, XXX, XXXI, XXXII, XXXIII, XXXIV, XXXV, XXXVI, XXXVII, XXXVIII, XXXIX, XL, XLI, XLII, XLIII, XLIV, XLV, XLVI, XLVII, XLVIII, XLIX, L, LI, LII, LIII, LIV, LV, LVI, LVII, LVIII, LIX, LX, LXI, LXII, LXIII, LXIV, LXV, LXVI, LXVII, LXVIII, LXIX, LXX, LXXI, LXXII, LXXIII, LXXIV, LXXV, LXXVI, LXXVII, LXXVIII, LXXIX, LXXX, LXXXI, LXXXII, LXXXIII, LXXXIV, LXXXV, LXXXVI, LXXXVII, LXXXVIII, LXXXIX, XC, XCI, XCII, XCIII, XCIV, XCV, XCVI, XCVII, XCVIII, XCIX, C";
        String[] dictmass = dictionary.split(", ");
        if (vvodmass.length != 3) {
            throw new IOException();
        }
            for (int k = 1; k < dictmass.length; k++) {
                if (dictmass[k].equals(vvodmass[0])) {
                    a = k;
                    m = 1;
                }
                if (dictmass[k].equals(vvodmass[2])) {
                    b = k;
                    n = 1;
                }
            }
            String chisla = "0,1,2,3,4,5,6,7,8,9,10";
            String[] chismass = chisla.split(",");
            for (int f = 1; f <= 10; f++) {
                if (chismass[f].equals(vvodmass[0])) {
                    a = f;
                    n = 2;
                }
                if (chismass[f].equals(vvodmass[2])) {
                    b = f;
                    m = 2;
                }
            }
            switch (vvodmass[1]) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
            }

            if (n != m) {
                throw new IOException();
            } else if (a > 10 && b > 10) {
                throw new IOException();
            } else if (n == 1 && a <= 0) {
                throw new IOException();
            } else if (m == 1 && b <= 0) {
                throw new IOException();
            } else if (n == 1 && result <= 0) {
                throw new IOException();
            } else if (m == 1) {
                System.out.println(dictmass[result]);
            } else {
                System.out.println(result);
            }
        }
    }








