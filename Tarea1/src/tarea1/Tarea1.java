/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author tamar
 */
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float sumatoria;
        int totald1,totald2,total=0;
        
        
        int [] [] matriz = new int [4] [4];
        int cont =1*5;
        totald1 =0;
        totald2 =0;
        
        for (int f = 0; f < 4; f++) { //filas
            for (int c = 0; c < 4; c++) { //columnas
                matriz[f][c]= cont++; 
                if (c==f){
                    totald1+=matriz[f][c];
                }
                if (c +f == matriz.length -1){
                    totald2+=matriz[f][c];
                }
            }
        }
        total=totald1+totald2;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("    "+matriz [i][j]);
                
            }
            System.out.println("");
        }
        System.out.println("Total de diagonal 1 = " + totald1);
        System.out.println("Total de diagonal 2 = " + totald2);
        System.out.println("Total de suma de diagonales = " + total);
        
        
    }
    
}
