
/**
 *  Clase que dibuja una figura 
 * 
 * @author - 
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';


    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public  void dibujarFigura(int altura) {
       String espaciosTotal = ""; 
       String espacios = "";
       int contador = (((altura * 4)-4)/2);
        
        String fila = "";
        for(int i = 1; i <= altura;i++){
            if(i % 2 == 0){
                for(int j = 0; j <= 3; j++){
                    fila += CAR2;
                    
                }
                for(int h = 0; h <= contador ;h++){
                    espacios += ESPACIO; 
                       
                }
                contador -= 2;
                System.out.println(espacios + fila);
                espacios = "";
            }
            else{
                for(int j = 0; j <= 3; j++){
                  fila += CAR1;
                  
                }
                for(int h = 0; h <= contador ;h++){
                   espacios += ESPACIO; 
                       
                }
                contador -= 2;
                System.out.println(espacios + fila);
                espacios = "";
            }
        }
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
         

    }
}
