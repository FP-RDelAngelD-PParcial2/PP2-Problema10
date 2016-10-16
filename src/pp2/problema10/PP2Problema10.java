/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema10;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serieFibonacci();
    }
    public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static void serieFibonacci(){
        int numero;
        int f1;
        int f2;
        do{
            numero = solicitarDatos("numeros a mostrar de la serie Fibonacci ");//Ingresar datos hasta que sea mas que 1, ya 
                                                                                //que se debe mostrar minimo un numero
        }while(numero<1);         
        System.out.print("Los primeros " + numero + " numeros de la serie Fibonacci son: "); //Se imprime los primeros (numero elegido)
                                                                                             //numeros de la serie Fibonacci son
       f1=1; 
       f2=1;
       System.out.print(f1 + "\n"); //La serie siempre comienza con 1
       for(int i = 2;i<=numero;i++){//i es igual a 2, mientras i sea menor a el numero introducido, i aumentara 1
           System.out.print(f2 + "\n");
           f2 = f1 + f2;
           f1 = f2 - f1;
       }
    }
}
