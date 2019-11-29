/*
 * Examen Refactorizacion
 * 
 */
package factorial;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nombre;
        String edad;

        int edadEnMeses;
        int edadEnDias;
        int edadEnHoras;
        int valorEdad;

        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        valorEdad = Integer.parseInt(edad);

        edadEnMeses = (valorEdad * 12);
        edadEnDias = (valorEdad * 365);
        edadEnHoras = (edadEnDias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + edadEnMeses, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + edadEnDias, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + edadEnHoras, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
