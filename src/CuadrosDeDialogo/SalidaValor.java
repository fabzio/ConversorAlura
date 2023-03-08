package CuadrosDeDialogo;//Mostrar un mesaje en como un cuadro de dialogo con un solo boton "Ok"
import javax.swing.JOptionPane;
public class SalidaValor{
    public static void VentanaSalida(Double valor,String moneda){
        JOptionPane.showMessageDialog(null,String.format("Tienes %.2f %s",valor,moneda));
    }

}
