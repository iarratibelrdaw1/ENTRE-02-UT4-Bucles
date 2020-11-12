import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    public void hacerSumasOctales()
    {
        int num1;
        int num2;
        Utilidades esOctalN1 = new Utilidades();
        Utilidades esOctalN2 = new Utilidades();
        char respuesta;
        
        
        do{
            borrarPantalla();
            System.out.print("Teclee número1: ");
            num1 = teclado.nextInt();
            System.out.print("Teclee número2: ");
            num2 = teclado.nextInt();
            if(esOctalN1.estaEnOctal(num1) != true || esOctalN2.estaEnOctal(num2) != true || esOctalN1.contarCifras(num1) != esOctalN2.contarCifras(num2)){
                    if(esOctalN1.estaEnOctal(num1) != true || esOctalN2.estaEnOctal(num2) != true ){
                    System.out.println("Alguno de los números no está en octal");
                    
                }
                else{
                    System.out.println("No tienen el mismo nº de cifras");
                    
                }
            }
            
            if(esOctalN1.estaEnOctal(num1) == true && esOctalN2.estaEnOctal(num2) == true && esOctalN1.contarCifras(num1) == esOctalN2.contarCifras(num2)){
                calculadora.sumarEnOctal(num1, num2); 
                System.out.println("__________________________________");
                System.out.println("\t\t\t" + num1);
                System.out.println("\t\t\t" + num2);
                System.out.println("\tSuma octal:\t" + calculadora.sumarEnOctal(num1, num2));
            }   
            System.out.println("\nQuiere hacer otra suma en octal? (S/s)");
            respuesta = teclado.next().charAt(0);
        
        }while (esOctalN1.estaEnOctal(num1) != true || esOctalN2.estaEnOctal(num2) != true || esOctalN1.contarCifras(num1) != esOctalN2.contarCifras(num2)||respuesta == 's' || respuesta == 'S');
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        borrarPantalla();
        System.out.print("Ahora dibujará una figura\n\n\n");
        int altura;
        do{
            System.out.print("Altura de la figura? (1-10)\n");
            altura = teclado.nextInt();
            if(altura < 1 || altura > 10){
                System.out.print("Error,");
            }
        }while(altura < 1 || altura > 10);
        pintor.dibujarFigura(altura);
    }
    
    private void borrarPantalla(){
        System.out.print("\u000C");
    }
}
