/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa;

import java.util.Scanner;
import ruletarusa.servicios.RuletaRusaServicios;

/**
 *
 * @author MegaTecnologia
 */
public class RuletaRusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        RuletaRusaServicios a = new RuletaRusaServicios();
        
        a.ronda();
        
        
        
        
    }
    
}
