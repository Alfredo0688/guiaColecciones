/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le 
pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará 
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y 
se mostrará la lista ordenada.
 */
package pkg02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Main {

 
    public static void main(String[] args) {
       ArrayList<String>razas = new ArrayList<>();
        Scanner Entrada = new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        String raza = "";
        String eleccion = "";
        boolean bandera = false;
            
        do{
            
            System.out.print("Ingrese una raza: ");
            raza = Entrada.nextLine();
            
            razas.add(raza);
            
            while(!eleccion.equalsIgnoreCase("s") && !eleccion.equalsIgnoreCase("n")){
                System.out.print("Agregar otra raza de perro? [s/n]");
                eleccion = Entrada.nextLine();
            }
            if(eleccion.equalsIgnoreCase("n")){
                bandera = true;
            }
            eleccion ="";
        }while(bandera==false);
        
        for (String perro : razas) {
            System.out.println(perro);
        }
        
        System.out.print("Ingrese un perro: ");
        raza = Entrada.nextLine();
        Iterator it = razas.iterator();
        
        while(it.hasNext()){
            
            if(it.next().equals(raza)){
                it.remove();
            }
        
        }
        Collections.sort(razas);
        for (String perro : razas) {
            System.out.println(perro);
        }
    }
    
}
