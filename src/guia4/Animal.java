/*
 La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá 
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
 */
package guia4;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;

    public void queCome() {
        JOptionPane.showMessageDialog(null, nombre + " Come " + alimento);
    }

    public Animal(String nombre, String alimento, int edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
}
