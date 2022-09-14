/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletarusa.servicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import ruletarusa.entidades.Juego;
import ruletarusa.entidades.Jugador;
import ruletarusa.entidades.RevolverDeAgua;

/**
 *
 * @author MegaTecnologia
 */
public class RuletaRusaServicios {
    
    Scanner leer = new Scanner(System.in);
    
    RevolverDeAgua a1 = new RevolverDeAgua();
    Jugador a2 = new Jugador();
    Juego a3 = new Juego();
    
    ArrayList<Jugador> jugadores = new ArrayList();
    ArrayList<Juego> juego = new ArrayList();
    
    public void llenarRevolver() {
        
        a1.setPosicionActual((int) (Math.random() * 6));
        System.out.println("Posición actual: "+a1.getPosicionActual());
        a1.setPosicionAgua((int) (Math.random() * 6));
        System.out.println("Posición actual del agua: "+a1.getPosicionAgua());
                        
    }   
    
    public boolean mojar() {
        
        System.out.println("¿El jugador se mojó?");
        
        boolean mojar = (a1.getPosicionActual()==a1.getPosicionAgua());
                    
            if (mojar){
                System.out.println("Sí");
            } else {
                System.out.println("No");
            }
            
        return mojar;
    }
    
    public void siguienteChorro() {
       
        if (a1.getPosicionActual()==6) {
            
            a1.setPosicionActual(1);
            
        } else {
            
            a1.setPosicionActual(a1.getPosicionActual()+1);
            
        }
        
    }
    
    
    public void crearJugador() {
        
        int jugador = 1;
        
        do {
            
            Jugador a2 = new Jugador();
            
            a2.setId(jugador);
            
            System.out.println("Introduzca el nombre del jugador");
            a2.setNombre(leer.next());
            
            a2.setMojado(false);
                        
           jugador++;  
            
           jugadores.add(a2);
           
        } while (jugador<=6);
        
    }
    
    public void disparo() {
        
        if (mojar()) {
            System.out.println("Finalizó el juego");
        } else {
            siguienteChorro();
        }
        
    }
    
    public void llenarJuego() {
        
        crearJugador();
        llenarRevolver();
        
    }
    
    public void ronda() {
        
        llenarJuego();
        
        disparo();
            
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
