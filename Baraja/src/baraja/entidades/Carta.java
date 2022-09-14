/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baraja.entidades;

/**
 *
 * @author MegaTecnologia
 */
public class Carta {
    
    private int num;
    private PaloCarta palo;

    public Carta() {
    }

    public Carta(int num, PaloCarta palo) {
        this.num = num;
        this.palo = palo;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public PaloCarta getPalo() {
        return palo;
    }

    public void setPalo(PaloCarta palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "num=" + num + ", palo=" + palo + '}';
    }
    
    
    
 
   
    
}
