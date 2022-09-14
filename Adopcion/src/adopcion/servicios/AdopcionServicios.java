/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adopcion.servicios;

import adopcion.entidades.Perro;
import adopcion.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author MegaTecnologia
 */
public class AdopcionServicios {
    
        Scanner leer = new Scanner(System.in);
    
        ArrayList<Persona> personas = new ArrayList();
        ArrayList<Perro> perros = new ArrayList();
        
        public void crearPersonas() {
            
            int persona = 1;
            int num = 1;
            
            do {
                
                Persona a = new Persona();
                
                System.out.println("Persona número: "+num);
                
                System.out.println("Ingrese el nombre de la persona: ");
                a.setNombre(leer.next());
                
                System.out.println("Ingrese el apellido de la persona: ");
                a.setApellido(leer.next());
                
                System.out.println("Ingrese el documento de la persona: ");
                a.setDni(leer.nextInt());
                
                num++;
                persona++;
                
                personas.add(a);
                
            } while (persona == 2);
            
        }
        
        public void crearPerros() {
            
            int perro = 1;
            int num = 1;
            
            do {
                
                Perro z = new Perro();
                
                System.out.println("Perro número: "+num);
                
                System.out.println("Ingrese el nombre de los perros: ");
                z.setNombre(leer.next());
        
                System.out.println("Ingrese la edad de los perros: ");
                z.setEdad(leer.nextInt());
                
                System.out.println("Ingrese la raza de los perros: ");
                z.setRaza(leer.next());
        
                System.out.println("Ingrese el tamaño de los perros (cm): ");
                z.setTamaño(leer.nextInt());
                
                num++;
                perro++;
                         
                perros.add(z);
                
            } while (perro == 2);
            
        }
        
        public void mostrarInformacion() {
            
            System.out.println("Las personas actuales de la lista son: ");
            
            for (Persona aux : personas) {
                System.out.println("Nombre: "+aux.getNombre()+" Apellido: "+aux.getApellido());
            }
            
            System.out.println("Los perros actuales de la lista son: ");
            
            for (Perro p : perros) {
                System.out.println("Nombre: "+p.getNombre()+" Raza: "+p.getRaza());
            }
                                   
        }
        
        public void adoptarPerro() {
            
            for (Persona aux : personas) {
                System.out.println(aux.getNombre()+" "+aux.getApellido()+""
                        + "¿Qué mascota desea adotpar?");
                System.out.println("Perros en adopción");
                
                for (Perro p : perros) {
                    System.out.println(p);
                }
                
                String respuesta = leer.next().toUpperCase();
                Iterator<Perro> iterador = perros.iterator();
                
                while (iterador.hasNext()) {
                    Perro var = iterador.next();
                    if (var.getNombre().equals(respuesta)) {
                        aux.setPerro(var);
                        iterador.remove();
                    }
                }
            }
        }
        
        
        
    
    
    
    
    
    
    
}
