package CuadrosDeDialogo;

import javax.swing.JOptionPane;
public class Menu {
    //CuadrosDeDialogo.Menu desplegable donde se elegira si se quiere cambio de moneda o conversor de temperatura
    //El titulo de la ventana es "CuadrosDeDialogo.Menu"
    //El mensaje es "Seleccione una opción de conversión"
    private final String[]  opciones = {"Cambio de moneda", "Conversor de temperatura"};
    public String opcion = (String) JOptionPane.showInputDialog(
            null,
            "Seleccione una opción de conversión", "CuadrosDeDialogo.Menu", JOptionPane.PLAIN_MESSAGE,
            null, opciones, opciones[0]
    );
    //Atributo que guarda la opcion seleccionada
}
