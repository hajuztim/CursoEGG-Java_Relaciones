/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja.servicios;

import baraja.entidades.Carta;
import baraja.entidades.PaloCarta;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MegaTecnologia
 */
public class BarajaServicios {
    
    ArrayList<Carta> baraja = new ArrayList();
    
    public void crearBaraja() {
        
        for (PaloCarta aux : PaloCarta.values()) {
            for (int i = 1 ; i <= 12 ; i++) {
                if (!(i== 8 || i == 9)) {
                    Carta car = new Carta();
                    car.setNum(i);
                    car.setPalo(aux);
                    baraja.add(car);
                    System.out.println(car.getNum()+" "+car.getPalo());
                }
            } 
        }
    }
    
    public void barajar() {
        
        Collections.shuffle(baraja);
        
        System.out.println("Se barajará la carta");
        
        for (Carta aux : baraja) {
            System.out.println(aux);
        }
        
    }
    
    public void siguienteCarta() {
        
        
             
        
    }
    
    
    
}
