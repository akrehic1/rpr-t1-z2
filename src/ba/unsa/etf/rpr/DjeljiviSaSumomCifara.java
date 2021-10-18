package ba.unsa.etf.rpr;

import java.util.Scanner;

public class DjeljiviSaSumomCifara {

    private static int SumaCifara (int broj) {
        int suma = 0;
        while (broj != 0) {
            suma = suma + (broj % 10);
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 0;
        System.out.print("Unesite n: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println("Brojevi koi su djeljivi sa sumom svojih cifara su: ");
        for (int i = 1; i<=n; i++) {
            if (i % SumaCifara(i) == 0) System.out.println(i);
        }

    }
}
