package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // START    END   STEP
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello world");
        }
        // i=0, i=1, i=2, i=3, i=4

        System.out.println();
        int ii = 0;
        while (ii < 5) {
            System.out.println("Hello world");
            ii++;
        }

        // Wyswietl na ekran 20 razy dzien tygodnia (wybrany)

        for (int i = 0; i < 20; i++) {
            System.out.println("Poniedzialek");
        }
        System.out.println();

        int aa = 0;
        while (aa < 20) {
            System.out.println("Wtorek");
            aa++;
        }

        // Wypisz na konsoli liczby od 1 do 20 uzywajac petli for
        // *nie tworz dodatkowych zmiennych
        for (int b = 1; b <= 20; b++) {
            System.out.print(b + " ");
        }
        System.out.println();
        // Wypisz na konsoli liczby od 20 do 1
        for (int bb = 20; bb >= 1; bb--) {
            System.out.print(bb + " ");
        }
        System.out.println();
        // Wypisz na konsoli liczby podzielne przez 2 z zakresu 5 do 30
        for (int b1 = 5; b1 <= 30; b1++) {
            if (b1 % 2 == 0)
                System.out.print(b1 + " ");
        }
        System.out.println();


    }
}