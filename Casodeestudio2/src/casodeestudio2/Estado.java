/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casodeestudio2;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class Estado {
    
   public static final String estado_libre = "Libre";
   public static final String estado_ocupada = "Ocupada";
   public static final String estado_Sucia = "Sucia";
   
   //Validar estado 
   
   public static boolean ValidarEstado (String estado){
       return estado.equals(estado_libre)||
               estado.equals(estado_ocupada)||
               estado.equals(estado_Sucia);
       
   }
   
   //Mostrar estados disponibles
   
   public static String seleccionarEstado() {
        Object estadoSeleccionado = JOptionPane.showInputDialog(
            null,
            "Seleccione el estado:",
            "Estado de Habitación",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new String[]{estado_libre,estado_ocupada,estado_Sucia},
            estado_libre
        );
        
        return estadoSeleccionado != null ? estadoSeleccionado.toString() : estado_libre;
   }
   
    
}
