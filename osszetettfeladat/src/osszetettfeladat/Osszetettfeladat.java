package osszetettfeladat;
import java.util.Scanner;
public class Osszetettfeladat {

    public static void main(String[] args) {
        System.out.println("ÖSSZETETT FELADATSOR 113C");
        Scanner bemenet = new Scanner(System.in);
        char valasz = 0;
        do{
            int darabszam = (int) (Math.random() * 10) + 30;
        
        int szamok1[] = new int[darabszam];
        int szamok2[] = new int[darabszam];

        for (int i = 0; i < darabszam; i++) {
            szamok1[i] = (int) (Math.random() * -50) + 50;
            szamok2[i] = (int) (Math.random() * -50) + 50;
        }
        System.out.println("A szamok1 elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok1[i]) + " ");
        }
        System.out.println("A szamok2 elemei: ");
        for (int i = 0; i < darabszam; i++) {
            System.out.print(String.format("%,4d", szamok2[i]) + " ");
        }

        int ujTomb[] = new int[darabszam];
        int ujTombdb = 0;
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok1[i];
            }
            if (szamok2[i] % 5 == 0) {
                ujTomb[ujTombdb++] = szamok2[i];
            }

        }
        System.out.println("Az ujTomb elemei: ");
        for (int i = 0; i < ujTombdb; i++) {
            System.out.print(String.format("%,4d", ujTomb[i]) + " ");
        }
        
        for (int i = 0; i < ujTombdb; i++) {
            if (ujTomb[i] == 0) {
                System.out.println("Az ujTomb tartalmaz 0-át");
            }
        }
        int legnagyobb = szamok1[0];
        int legkisebb = szamok1[0];
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] > legnagyobb) {
                legnagyobb = szamok1[i];
            }
        }
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] < legkisebb) {
                legkisebb = szamok1[i];
            }
        }
        
        if (legnagyobb % legkisebb == 0) {
            System.out.println("A szamok1 tömb legnagyobb eleme a legkisebbnek a  többszöröse");
        }
        else {
            System.out.println("A szamok1 tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
        int legnagyobb2 = szamok2[0];
        int legkisebb2 = szamok2[0];
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] > legnagyobb2) {
                legnagyobb2 = szamok1[i];
            }
        }
        for (int i = 0; i < darabszam; i++) {
            if (szamok1[i] < legkisebb2) {
                legkisebb2 = szamok1[i];
            }
        }
        
        if (legnagyobb2 % legkisebb2 == 0) {
            System.out.println("\nA szamok2 tömb legnagyobb eleme a legkisebbnek a többszöröse");
        }
        else {
            System.out.println("\nA szamok2 tömb legnagyobb eleme nem többszöröse a legkisebbnek");
        }
            System.out.println("Újra futtatja? i/n: ");
            valasz = bemenet.next().charAt(0);
    } while ((valasz == 'i') || (valasz == 'I'));
}
}
