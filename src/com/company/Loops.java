package com.company;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        //ZADANKA

        //a) Wypisz na konsoli liczby od 20 do 1
        for (int q = 20; q >= 1; q--) {
            System.out.print(q + " ");
        }
        System.out.println();
        //b) Wypisz na konsoli liczby od 1 do 20 oddzielone przecinkiem
        for (int w = 1; w <= 20; w++) {
            System.out.print(w + ", ");
        }
        System.out.println();

        //c) Za pomocą pętli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
        //dodaj napis'duża liczba'

        int e = 0;
        while (e < 10) {
            if (e > 5)
                System.out.print(e + " Duza liczba ");
            e++;
        }
        System.out.println();

        // d) Napisz program liczacy sume liczb z zakresu od 1 do 100
        int suma = 0;
        for (int r = 1; r < 100; r++) {
            // alternatywnie -> suma += r
            suma = suma + r;
        }
        System.out.print("Suma liczb z zakresu 1 do 100 to " + suma);

        System.out.println();

        // e) Wypisz wszystkie liczby
        //parzyste z zakresu 1-30
        int t = 1;
        while (t <= 30) {
            if (t % 2 == 0)
                System.out.print(" " + t);
            t++;
        }
        System.out.println();

        //f) Napisz program który wyswietli liczby podzielne przez 3 z zakresu 14-38
        int y = 14;
        while (y <= 38) {
            if (y % 3 == 0)
                System.out.print(" " + y);
            y++;
        }
        System.out.println();

        //g) Wypisz liczby od 40 do 3 w dół za pomoca petli while
        int u = 40;
        while (u >= 3) {
            System.out.print(" " + u);
            u--;
        }
        System.out.println();

        //h) Napisz program, który wypisuje liczby od n do 50 gdzie n jest
        //wartoscia podana przez uzytkownika, które są nieparzyste.

/*        int n = 0;

        for (int x = n; x <= 50; x++) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        System.out.println("Dej Inta byqu");
        Scanner scannerInt = new Scanner(System.in);
        int value = scannerInt.nextInt();
        System.out.println("Liczba wprowadzona " + value);

        System.out.print(" Liczby nieparzyste: "); // dodane tutaj zeby nie wypisalo do kazdej liczby
        while (value <= 50) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
            value++; //dodane tutaj bo w ifie byloby caly czas zaciete na parzystej i nigdy by nie przeszlo nizej na if -> sout
        }
        System.out.println();*/
           /*
           value = scannerInt.nextInt();
        while (value <= 50) {
            if (value % 2 != 0) {
                System.out.println(value);          //tu jest nieskonczona petla "Dupa" bo nie spelnia sie warunek IF
                value++;                            // jak trafisz na parzyste to trafia w nieskonczona petle, bo value++ jest w if do ktorego nie dochodzi
            }
            System.out.println("DUPA");
        }

            */

        //ZADANKA EXTRA!

        /*
        //Wyswietla na ekran za pomoca petli for

            *
           ***
          *****
         *******
        *********
       */
        int wysokosc = 5;
        for (int i = 1; i <= wysokosc; i++) {
            for (int spacja = 1; spacja <= wysokosc - i; spacja++) {
                System.out.print(" ");
            }
            for (int gwiazdka = 1; gwiazdka <= i * 2 - 1; gwiazdka++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 1.) Napisz program, ktory oblicza potege 2^n, gdzie liczbe nautralna n podaje uzytkownik.
        // Dla n=10 wynik to 2 do potegi 10 = 1024
        System.out.println("Podaj liczbe naturalna");
        Scanner scannerPow = new Scanner(System.in);
        int power = scannerPow.nextInt();
        System.out.println("Wprowadzona potega: " + power);
        int iloraz = 1;

        for (int i = 1; i <= power; i++){
            iloraz = iloraz * 2;
        }
        System.out.println("Potega: " + iloraz);

        System.out.println();



//            2^5 = 2 * 2 * 2 * 2 * 2
//                  1   2  3    4   5
//            2^5 = 2 * ... * n


        /*
        2.) Napisz program drukujacy na ekranie prostokat z literek X. Wysokosc i szerokosc prostokata
        wczytujemy z klawiatury. Dla szerokosci = 10 oraz wysokosc = 4. tak powinien wygladac prostokat

        **********
        *        *
        *        *
        **********
         */
        int width = 100;
        int height = 20;

        for (int i = 0; i < height; i++) {
            if (i == 0) {
                for (int j = 0; j < width; j++) {
                    System.out.print("x");
                }
                System.out.print("\n");
            } else if (i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("x");
                }
                System.out.print("\n");
            } else {
                for (int j = 0; j < width; j++) {
                    if (j == 0) {
                        System.out.print("x");
                    } else if (j == width - 1) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print("\n");
            }
        }
        /*

        Zadanie 3.) Napisz program który oblicza średnią arytmetyczna liczb natralnych od 5 do liczby
        podanej przez uzytkownika. Wypisac obliczona srednia na konsoli.

        Dla n=9 program ma wypisac (5+6+7+8+9)/5 = 35/5=7
         */
        System.out.println();

        System.out.println("Podaj inta do sredniej arytmetycznej: ");
        Scanner scanner = new Scanner(System.in);
        int rangeEnd = scanner.nextInt();
        int rangeStart = 5;
        int rangeDifference = rangeEnd - rangeStart + 1;
        int suma2 = 0;
        System.out.println("Wprowadzona liczba " + rangeEnd);

        for (int i = rangeStart; i <= rangeEnd; i++) {
            suma2 = suma2 + i;
        }
        double srednia = suma2 / rangeDifference;
        System.out.println("Srednia Arytmetyczna to: " + srednia);

        System.out.println();


        // 4.) Napisz program, który sumuje liczby z zakresu 1-40 ale tylko te które sa podzielne przez 3

        int suma1 = 0;
        for (int z = 1; z <= 40; z++) {
            if (z % 3 == 0) {
                suma1 = suma1 + z;
            }
        }
        System.out.print("Suma liczb z zakresu 1 do 40 to " + suma1);
    }
}
