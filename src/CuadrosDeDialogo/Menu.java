package CuadrosDeDialogo;

import javax.swing.JOptionPane;
public class Menu {

    private final String[]  opciones = {"Cambio de moneda", "Conversor de temperatura"};
    public String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción de conversión", "CuadrosDeDialogo.Menu", JOptionPane.PLAIN_MESSAGE,
            null, opciones, opciones[0]
    );
}
