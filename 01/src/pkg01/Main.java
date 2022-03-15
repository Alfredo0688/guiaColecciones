/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si 
decide salir, se mostrará todos los perros guardados en el ArrayList.
 */
package pkg01;

import java.util.ArrayList;
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
    }
    
}
