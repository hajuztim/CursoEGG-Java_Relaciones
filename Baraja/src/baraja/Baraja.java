/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja;

import baraja.servicios.BarajaServicios;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class Baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        BarajaServicios a = new BarajaServicios();
        
        a.crearBaraja();
        
        
        // Barajar
        
        a.barajar();
        
        
    }
    
}
