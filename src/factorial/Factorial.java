package factorial;

public class Factorial {

    public static void main(String[] args) {

        int numeroCondicion;
        int numeroAFactorizar;

        numeroCondicion = 8;

        int contador;
        if (numeroCondicion == 0) {
            numeroAFactorizar = 1;
        } else {
            numeroAFactorizar = 1;
            for (contador = numeroCondicion; contador >= 1; contador--) {
                numeroAFactorizar = numeroAFactorizar * contador;
            }
        }

        System.out.println(numeroAFactorizar);

    }

}
