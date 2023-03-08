package CuadrosDeDialogo;

import javax.swing.JOptionPane;
public class OpcionesMonedas {
    //titulo: Monedas
    //mensaje: Elija la moneda a la que deseas convertir tu dinero
    //opcines:
  /*
  De Pesos a Dolar
  De Pesos a Euro
  De Pesos a Libra
  De Pesos a Yen
  De Pesos a Won Coreano
  De Dolar a Pesos
  De Euro a Pesos
  De Libra a Pesos
   */
    private final String[] opciones = {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libra", "De Pesos a Yen",
            "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libra a Pesos"};
    public String opcion = (String) JOptionPane.showInputDialog(null, "Elija la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);


}
