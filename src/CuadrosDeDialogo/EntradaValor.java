package CuadrosDeDialogo;//Cuandro de entrada de valor de de diner para convertir a la modena escogida con swing
import javax.swing.JOptionPane;

public class EntradaValor {
    private final String valor = JOptionPane.showInputDialog("Introduce el valor a convertir");
    public double valorConvertir = Double.parseDouble(valor);
}
