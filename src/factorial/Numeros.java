package factorial;

/**
 *
 * @author
 */
public class Numeros {

    /**
     */
    //Codificado por: sAfOrAs
    //LIstar los Numeros según el numero de digitos indicado
    //Considero solo hasta Numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar Numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean validez = false;

    public static void main(String arg[]) {
        int numeroDigitos1 = 0;
        int numeroDigitos2 = 0;
        numeroDigitos1 = Integer.parseInt(arg[0]);
        if (numeroDigitos1 <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int posicion1 = 1; posicion1 <= 99999; posicion1++) {
            int divisor1 = posicion1;
            int contador1 = 0;

            while (divisor1 != 0) {
                divisor1 = divisor1 / 10;
                contador1++;
            }
            numeroDigitos2 = contador1;

            if (numeroDigitos2 == numeroDigitos1) {
                if (posicion1 < 4) {
                    validez = true;
                } else {
                    if (posicion1 % 2 == 0) {
                        validez = false;
                    } else {
                        int contador2 = 0;
                        int posicion2 = 1;
                        int divisor2 = (posicion1 - 1) / 2;
                        if (divisor2 % 2 == 0) {
                            divisor2--;
                        }
                        while (posicion2 <= divisor2) {
                            if (posicion1 % posicion2 == 0) {
                                contador2++;
                            }
                            posicion2 += 2;
                            if (contador2 == 2) {
                                posicion2 = divisor2 + 1;
                            }
                        }

                        if (contador2 == 1) {
                            validez = true;
                        }
                    }
                }

                if (validez == true) {
                    System.out.println(posicion1);
                }
            }
        }
    }
}
