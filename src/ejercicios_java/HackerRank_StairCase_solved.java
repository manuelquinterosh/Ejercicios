/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

import static ejercicios_java.HackerRank_StairCase.staircase;

/**
 *
 * @author DELL
 */
public class HackerRank_StairCase_solved {
     public static void main(String[] args) {
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        System.out.println("Ingrese N:");
        int n = entrada.nextInt();

        staircase(n);
    }
      static void staircase(int n) {
       
           for(int i = 0; i < n; i++){ //System.out.println(i);  //0-1
            for(int j = 0; j < n; j++){  //System.out.println(j); 
             /**
              01          
              01
              0123
              0123
              **/
                if(j < n-1-i){        
                    //* < 2-1-0 = 1
                    //* < 2-1-1 = 
  
                    
                    System.out.print(" ");
                    //#
                    // System.out.println(j);
                }else{
                    System.out.print("#");
                }
            }
            System.out.println();
        }

    }
     
}
