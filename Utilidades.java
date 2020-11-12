
import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Irune Arratibel
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int resto = 0;
        boolean resultado = true;
        int cantCifras = 0;
        while(n != 0 && resultado != false){
           resto = n % 10;
           n = n / 10;
           if(resto > 7){
              resultado = false; 
            }
           else{
            resultado = true;
            }
        }  
        return resultado;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cantidadCifras = 0;
        while(n != 0){
            n = n / 10;
            cantidadCifras++;
        }
        return cantidadCifras;

    }

   
    
}
