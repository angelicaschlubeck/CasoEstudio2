/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Casodeestudio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Main
        
      Hotel hotel = new Hotel(3,4); 
      
      while(true){
          String opciones = JOptionPane.showInputDialog(
                  "Sistema de Gestion del Hotel Angelica\n\n" +
                   "1.Ver habitaciones:\n" +
                   "2. Cambiar status:\n"+
                   "3. Ver Resumen de ganancias y habitaciones:\n" +
                   "4. SALIR\n\n" +
                   "Seleccione una opcion:");
          
          
          switch (opciones) {
              case "1":
                      hotel.mostrarHabitaciones();
                
                  break;
                  
              case "2":
                  String numerohab = JOptionPane.showInputDialog("Ingrese el numero de habitacion:");
                  if(numerohab != null){
                      String nuevoEstado = Estado.seleccionarEstado(Integer.parseInt(numerohab, nuevoEstado);
                  } //error no se termino 
                  
                  break;
              case "3":
                  hotel.mostrarResumen();
                  break;
                  
              case"4":
                  return;
              default:
                  break;
          }
                          
                          
                  
                 
          
          
                  
                  
      
      
      }
        
        
        
      
    }
    
}
