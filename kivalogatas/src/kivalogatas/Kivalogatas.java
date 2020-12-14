package kivalogatas;
import  java.util.Scanner;

public class Kivalogatas {

    
    public static void main(String[] args) {
        Scanner bemenet;
        bemenet = new Scanner(System.in);
        
        System.out.println("\t Kiválogatás Tétele\n");
        int mennyi;
        
        System.out.print("Hány jegy legyen kiírva? ");
            mennyi = bemenet.nextInt();
            
        int erdemjegyek[]= new int [mennyi];       
        int masolat [] = new int [mennyi];
        
        for (int i = 0; i < mennyi; i++) {
            erdemjegyek[i]= (int)(Math.random()*4)+1;
        }
        System.out.print("A jegyek: ");
        for (int i = 0; i < mennyi; i++) {
            System.out.print(erdemjegyek[i]+" ");
        }
        
        System.out.println("");
        
        int kettesekDb=0;
        for (int i = 0; i < mennyi; i++) {
            if (erdemjegyek[i]==2) {
                masolat[kettesekDb++]=erdemjegyek[i];
            }
        }
        System.out.print("Másolat tömb elemei: ");
        
            if (kettesekDb > 0){
                for (int i = 0; i < kettesekDb; i++) {
                    System.out.print(masolat[i]+" ");               
                }
            }
            else {
                System.out.print("nincs 2-es");
            }
        
        System.out.println("\nKettesek száma: "+kettesekDb);
        
        
        
        bemenet.close();
    }
    
}