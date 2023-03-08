//Controlador de la aplicacion
import CuadrosDeDialogo.*;
import CuadrosDeDialogo.Error;
//Obtener precio del peso en dolares, euros, libras, yenes y won coreano
import javax.swing.*;

public class Main {
  private static final double factorPesoDolar = 0.056;
  private static final double factorPesoEuro = 0.053;
  private static final double factorPesoLibra = 0.047;
  private static final double factorPesoYen = 7.63;
  private static final double factorPesoWon = 73.23;

  public static void main(String[] args) {
    double factor = 0, resultado;
    String moneda = "";
    Menu menu = new Menu();
    //Al dar en conversor de moneda cambiar a la clase OpcionesMonedas;
    //Al dar en conversor de temperatura cambiar a la clase OpcionesTemperatura;
    //Al dar click en Ok en la ventana de CuadrosDeDialogo.Menu, se debe mostrar la ventana de OpcionesMonedas
    if(menu.opcion.equals("Cambio de moneda")){
      OpcionesMonedas opcionesMonedas = new OpcionesMonedas();
      switch (opcionesMonedas.opcion){
        case "De Pesos a Dólar":
          //Convertir pesos a dolar
          factor = factorPesoDolar;
          moneda = "dólares";
          break;
        case "De Pesos a Euro":
          //Convertir pesos a euro
          factor = factorPesoEuro;
          moneda = "euros";
          break;
        case "De Pesos a Libra":
          //Convertir pesos a libra
          factor = factorPesoLibra;
          moneda = "libras";
          break;
        case "De Pesos a Yen":
          //Convertir pesos a yen
          factor = factorPesoYen;
          moneda = "yenes";
          break;
        case "De Pesos a Won Coreano":
          //Convertir pesos a won coreano
          factor = factorPesoWon;
          moneda = "won coreanos";
          break;
        case "De Dólar a Pesos":
          //Convertir dolar a pesos
          factor = 1/factorPesoDolar;
          moneda = "pesos";
          break;
        case "De Euro a Pesos":
          //Convertir euro a pesos
          factor = 1/factorPesoEuro;
          moneda = "pesos";
          break;
        case "De Libra a Pesos":
          //Convertir libra a pesos
          factor = 1/factorPesoLibra;
          moneda = "pesos";
          break;
      }
      do{
        try{
          EntradaValor entradaValor = new EntradaValor();
          resultado = entradaValor.valorConvertir * factor;
          break;
        }catch (NumberFormatException ex){
          Error.VentanaError();
        }
      }while (true);

      SalidaValor.VentanaSalida(resultado, moneda);
      Continuar continuar = new Continuar();
      if(continuar.respuesta ==  JOptionPane.YES_OPTION){
        //Volver a mostrar el menu
        main(args);
      } else {
        System.exit(0);
      }
    } else if (menu.opcion.equals("Conversor de temperatura")){
      //OpcionesTemperatura opcionesTemperatura = new OpcionesTemperatura();
    }
    //Caso cancelar
    //Finalizar la aplicacion


  }
}