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
public class habitacion {
    
    private int numero_habitacion;
    private String tipo; 
    private double precioxnoche;
    private String estado; 
    public static final String estado_libre = "Libre";
    public static final String estado_ocupada = "Ocupada";
    public static final String estado_sucia = "Sucia";

    public habitacion(int numero_habitacion, String tipo, double precioxnoche) {
        this.numero_habitacion = numero_habitacion;
        this.tipo = tipo;
        this.precioxnoche = precioxnoche;
        this.estado = estado_libre;
    }
    

    
    //Setter
    public void setEstado(String estado){
        if(estado.equals(estado_libre)|| //Verficar que el estado sea el correcto 
           estado.equals(estado_ocupada) ||
           estado.equals(estado_sucia)){
            this.estado = estado;
        }
          
    }

    public String getEstado() {
        return estado;
    }

    public int getNumero_habitacion() {
        return numero_habitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioxnoche() {
        return precioxnoche;
    }
    
    
    
    public void mostrarInfo(){
        String info = "Habitacion #:" +
                numero_habitacion + "\n" +
                "Tipo:" + tipo + "\n" + 
                "Precio:$" + precioxnoche + "\n" +
                "Estado:" + estado;
        JOptionPane.showMessageDialog(null, info);
    
    
    }
    
    
    
    
    
    
    
}
