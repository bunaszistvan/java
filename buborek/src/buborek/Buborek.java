/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buborek;

/**
 *
 * @author User
 */
public class Buborek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tomb[] = new int[20];
        for(int i =0;i<20;i++){
            tomb[i] = (int) (Math.random()*100);
        }
        for(int i =0;i<19;i++){
            for(int j =0;j<19-i;j++){
                if(tomb[j]>tomb[j+1]){
                   int temp = tomb[j];
                   tomb[j] = tomb[j+1];
                   tomb[j+1] = temp;
                }                
            }        
        }
        System.out.println("A rendezett :");
        for(int i =0;i<20;i++){
            System.out.print(tomb[i]+" ");
        }
        
    }
    
}