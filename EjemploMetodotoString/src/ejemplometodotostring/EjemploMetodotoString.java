/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplometodotostring;

import java.util.Scanner;

/**
 *
 * @author gabo
 */
public class EjemploMetodotoString {
    // Programa para obtener el numero de aparatos electronicos que hay en una 
    // casa usando el metodo toString

    public static void main(String[] args) {
        
        // Declaramos las variables
        String nom;
        String id;
        int ed;
        int num;
        // Declaramos Scanner para poder ingresar los datos por teclado
        Scanner so = new Scanner(System.in);
        // Creamos un objeto 
        Persona p = new Persona();
        
        System.out.println("Ingrese el nombre de la persona");
        nom = so.nextLine();
        System.out.println("Ingrese la identificacion de la persona");
        id = so.nextLine();
        System.out.println("Ingrese la edad de la persona");
        ed = so.nextInt();
        System.out.println("Ingrese el numero de aparatos electronicos en casa ");
        num = so.nextInt();
        // Ingresamos nuestros datos en el metodo datosPersona
        p.datosPersona(nom, id, ed, num);
        
        // Imprimimos la informacion
        System.out.println(p.toString());
        
    }
    
}
