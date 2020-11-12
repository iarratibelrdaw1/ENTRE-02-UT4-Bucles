
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - 
 * 
 */
public class CalculadoraOctal
{

        /**
         * sumar dos nºs supuestos en base 8 y con el mismo
         * nº de cifras
         * Asumimos positivos
         */
        public int sumarEnOctal(int n1, int n2) {
            /*int restoN1 = 0;
            int otrosDecimalN1 = 0;
            int exponenteN1 = 0;
            int resultadoN1 = 1;
            int aDecimalN1 = 0;
            while(n1 != 0){
              restoN1 = n1 % 10;
              n1 = n1 / 10;  
              if(exponenteN1 == 0){
                  //para pasar el último numero a decimal
                  aDecimalN1 = restoN1;
              }
              else{
                  //para convertir el resto de los numeros a decimal y se vayan sumando
                  resultadoN1 *= 8;
                  otrosDecimalN1 = restoN1 * resultadoN1;
              }
              // para que se sume el primer numero con el resto
              aDecimalN1 = aDecimalN1 + otrosDecimalN1;
              exponenteN1++;
            }
            return aDecimalN1;
            
            */
            int restoN1 = 0;
            int restoN2 = 0;
            int llevada = 0;
            int total = 0;
            int totalFinal = 0;
            int totalUnitario = 0;;
            while(n1 != 0){
                totalUnitario = 0;
                restoN1 = n1 % 10;
                restoN2 = n2 % 10;
                totalUnitario = restoN1 + restoN2;
                totalUnitario += llevada;
                llevada = 0;
                n1 /=  10;
                n2 /= 10;
                while(totalUnitario >= 8){
                    totalUnitario -=  8;
                    llevada ++;
                }
                //Guarda todos los resultados en una variable
                total *= 10;
                total += totalUnitario;
            }
            
            // Si tiene una llevada final para que la ponga
            total *= 10;
            total += llevada;
            
            //Le da la vuelta al  número
            while(total != 0){
                totalFinal *= 10;
                totalFinal += total % 10;
                total /= 10;
            }
            return totalFinal;
    }
    }

