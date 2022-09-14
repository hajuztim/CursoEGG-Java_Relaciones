/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopcion;

import adopcion.entidades.Perro;
import adopcion.entidades.Persona;
import adopcion.servicios.AdopcionServicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        AdopcionServicios a = new AdopcionServicios();
               
        // Crear personas
        
        a.crearPersonas();
        
        //Crear perros
                
        a.crearPerros();
        
        // Información
        
        a.mostrarInformacion();
        
        // Asociación
        
        a.adoptarPerro();
        
        
        
        
        
        
    }
        
        
                
    
}
