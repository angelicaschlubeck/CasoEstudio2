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
public class Hotel {
    
    private habitacion[][] habitaciones;
    private int pisos;
    private int habitacionesxpiso;

    public Hotel(int pisos, int par1) {
        this.habitaciones = habitaciones;
        this.pisos = pisos;
        habitaciones = new habitacion[pisos][habitacionesxpiso];
        
    }
    
    private void crearHabitaciones(){
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < habitacionesxpiso; j++) {
                int numero = ((i +1)*100)+(j+1);
                String tipo = "Simple";
                double precio = 1000.0;
                habitaciones[i][j] = new habitacion(numero, tipo, precio);
                
            }
            
        }
    }
    
    
    public void mostrarHabitaciones(){
        String infoHab = "";
        for (int i = 0; i < pisos; i++) {
            infoHab += "Piso" + (i +1) + "\n";
            for (int j = 0; j < habitacionesxpiso; j++) {
                habitacion hab = habitaciones[i][j];
                infoHab += "Habitacion: " + hab.getNumero_habitacion() +
                        "| Estado:" + hab.getEstado() + "\n";
                        
                
                
            }
            
            infoHab += "\n;";
            
        }
        JOptionPane.showMessageDialog(null, infoHab);
                
    }
    
    public void mostrarResumen(){
        int libres = 0, ocupadas = 0,
                sucias = 0;
        double ganancias = 0;
        
        
        for (int i = 0; i < pisos; i++) {
            for (int j = 0; j < habitacionesxpiso; j++) {
                habitacion hab = habitaciones[i][j];
                
                switch(hab.getEstado()){
                    case Estado.estado_libre:
                        libres++;
                        
                        break;
                    case Estado.estado_ocupada:
                        ocupadas++;
                        ganancias += hab.getPrecioxnoche();
                        
                        break;
                        
                    case Estado.estado_Sucia:
                        sucias++;
                        
                        break;
                
                
            }
            
        }
    }
        
      
    String mensaje = "INFORMACION:\n\n" +
                    "Habitaciones Libres: " + libres + "\n" +
                    "Habitaciones Ocupadas: " + ocupadas + "\n" +
                    "Habitaciones Sucias: " + sucias + "\n\n" +
                    "Ganancias Actuales: $" + ganancias;

    JOptionPane.showMessageDialog(null, mensaje);
    
    
    
 
    
    
    
              
    
        
    
        
        
        
        
   
    
    
    
    
    
    } 
}
