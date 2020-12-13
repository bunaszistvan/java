package kivalasztas;
import java.util.Scanner;

public class Kivalasztas {

    public static void main(String[] args) {
        Scanner bemenet = new Scanner(System.in);
        
        int elemszam = 20;
                
        int tomb1[] = new int [elemszam];
        
        for (int i = 0; i < elemszam; i++) {
            tomb1[i] = (int) (Math.random()*100)+1;
        }
        System.out.println("eredeti:");
        for (int i = 0; i < elemszam; i++) {
            System.out.print(tomb1[i]+" ");
        }
        System.out.println("\n3-asával");
        for (int i = 3; i < elemszam; i+=3) {
            System.out.print(tomb1[i]+" ");
        }
        
        System.out.print("Melyik elem sorszámára vagy kíváncsi? ");
        int keresettSzam = bemenet.nextInt();
        
        System.out.println("\n");
        int j = 0;
        for (int i = 0; i < elemszam; i++) {
            if (tomb1[i] == keresettSzam){
                System.out.print("A keresett szám indexe: "+(i+1));
                break;
            }   
            j++;
            
        }
        
        if (elemszam == j){
            System.out.println("Nem volt benne.");
        }
        
        
        
        
        System.out.println("\n");
        int i = 0;
        while(tomb1[i] != keresettSzam){
            i++;
        }
        System.out.print("A keresett szám indexe: "+(i+1));
        
        
        bemenet.close();
    }
    
}
