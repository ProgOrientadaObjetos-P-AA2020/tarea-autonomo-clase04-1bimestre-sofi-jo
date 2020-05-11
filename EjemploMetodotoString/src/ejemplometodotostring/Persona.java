/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplometodotostring;

/**
 *
 * @author gabo
 */
public class Persona {
    // Declaracion de las variables
    private String nombre;
    private String id;
    private int edad;
    private int numero;
    
    // Metodo para los datos de la persona
    public void datosPersona(String a, String b, int c, int d){
        nombre = a;
        id = b;
        edad = c;
        numero = d;
    }
    
    public void establecerNombre(String a){
    nombre = a;
    }
    
    public void establecerId(String a){
    id = a;
    }
    
    public void establecerEdad(int a){
    edad = a;
    }
    
    public void establecerNumero(int a){
    numero = a;
    }
    
    public String obtenerNombre(){
    return nombre;
    }
    
    public String obtenerId(){
    return id;
    }
    
    public int obtenerEdad(){
    return edad;
    }
    
    public int obtenerNumero(){
    return numero;
    }
    
    // Se usa el @Override para dar uso al metodo toString
    // Ya que es el codigo que permite que se compile y se ejecute sin inconveniente
    @Override
    public String toString(){
        // Creamos el mensaje que se va a imprimir
       String mensaje = ""+nombre +"\tcon su identificación\t" +id+"\tde\t" +edad +"\t"
               + " años cuenta con "+numero +"\ndispositvos electronicos en su hogar"; 
    return mensaje;
    }
}
