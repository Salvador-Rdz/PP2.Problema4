/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema4;
import java.util.*;
/**
 *
 * @author Enano
 */
public class PP2Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        float temp;
        // Resolucion
        temp = getInf();
        print(convert(temp),temp);
    }
    public static float getInf () //Se recibe la temperatura.
    {
        Scanner in = new Scanner (System.in);
        System.out.println("**** Bienvenid@ al programa ****");
        System.out.println("Ingrese los grados Farenheit que quiere convertir a Celsius: ");
        return in.nextFloat();
    }
    public static float convert(float t)
    {
        float cel;
        cel=((t-32)*5)/9; //Se utiliza la fórmula de grados Farenheit a Celsius.
        return cel;
    }
    public static void print (float cel, float far)
    {
        System.out.println(far+ " grados Farenheit equivalen a "+cel+" grados Celsius");
    }
}
