/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_java;

/**
 *
 * @author DELL
 */
public class HackerRank_TimeConversion {
    public static void main(String[] args) {
         java.util.Scanner entrada = new java.util.Scanner(System.in);
         
         System.out.println("Digite fecha: ");
         String fecha = entrada.nextLine();
         
        String f= timeConversion(fecha);
        System.out.println(f);
    }
    
    
    static String timeConversion(String s) {
        boolean isAM = s.endsWith("AM");
        short hour = Short.valueOf(s.substring(0, 2));

        //System.out.println("isAM: "+isAM);
        //System.out.println("hour: "+hour);
        
        s = s.substring(0, s.length() - 2);
        
        //System.out.println("time: "+s);

        if(isAM) { //Si la AM es verdadero
            if(hour == 12) //Si la hora es igual a 12
                s = "00" + s.substring(2); // la hora ingresada va ser igual a: 00:30:10   
        } else {
            if(hour < 12) // Si la hora que ingreso es menor a 12
                s = (hour + 12) + s.substring(2); //Entonces s: que es la hora va ser igual a: hora + 12. 11+12= 23:
            //System.out.println("La S: "+ s);
        }

        return s;
    }
}
