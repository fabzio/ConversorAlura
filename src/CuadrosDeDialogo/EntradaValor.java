package CuadrosDeDialogo;
import javax.swing.JOptionPane;

public class EntradaValor {
    private final String valor = JOptionPane.showInputDialog("Introduce el valor a convertir");
    public double valorConvertir = Double.parseDouble(valor);
}
