package ejercicio_14_cuadrado;

import java.lang.Math;
import java.util.Scanner;
public class Ejercicio_14_Cuadrado {
    public static void main(String[] args) {
    Scanner Teclado = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int Num = Teclado.nextInt();
    System.out.println(Num+" Al cuadrado es: "+Math.pow(Num,2)+"\n"+Num+" Al Cubo es: "+ Math.pow(Num,3));
    }
    
}
