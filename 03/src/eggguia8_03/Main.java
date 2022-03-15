
package eggguia8_03;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        ArrayList<Integer>notas = new ArrayList<>();
        ArrayList<Integer>notas1 = new ArrayList<>();
        ArrayList<Integer>notas2 = new ArrayList<>();
        
        ArrayList<Alumno>listAlu = new ArrayList<>();
        
        
        Scanner Entrada = new Scanner(System.in);
        
        String nombre = "";
        Alumno alu = new Alumno();
        alu.setNombre("Ulises");
        notas.add(5);
        notas.add(2);
        notas.add(7);
        alu.setNotas(notas);
        
        Alumno alu2 = new Alumno();
        alu2.setNombre("Pepe");
        notas1.add(8);
        notas1.add(6);
        notas1.add(7);
        alu2.setNotas(notas1);
        
        Alumno alu3 = new Alumno();
        alu3.setNombre("Victoria");
        notas2.add(5);
        notas2.add(2);
        notas2.add(7);
        alu3.setNotas(notas2);
        
        listAlu.add(alu);
        listAlu.add(alu2);
        listAlu.add(alu3);
        
        //buscar alumno
        System.out.print("Nombre de alumno a buscar: ");
        nombre = Entrada.next();
        double promiedo = 0.0;
        for (Alumno alumno : listAlu) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Alumno encontrado");
                //metodoFinal(Alumno alumno);
                for (Integer n : alumno.getNotas()) {
                    promiedo += n;
                }
                System.out.println("Promedio: " + promiedo / 3);
            }
        }
        
        
            
    }
    
}
