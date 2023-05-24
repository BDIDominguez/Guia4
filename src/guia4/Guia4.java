/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vResp;
        do {
            System.out.println(" *************** MENU ***************** \n"
                    + " 1 --- Clases Animal y sus Hijas \n"
                    + " 2 ---- Electrodomestico y sus precios   \n"
                    + " 3 ---- Formas y sus calculos creando Interfaces \n"
                    + " 4 ---- Juegemos con Abstraccion!!    \n"
                    + " S ---- Salir \n");
            vResp = JOptionPane.showInputDialog("Que Opcion Elijes, S Sale");
            if (vResp == null){
                vResp = "S";
            }
            switch (vResp) {
                case "1":
                    Animal perro = new Perro("Stich","Carnivoro",15,"Doberman");
                    perro.queCome();
                    Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
                    perro1.queCome();
                    
                    Animal gato = new Gato("Pelusa", "Galleta", 15,"Siames");
                    gato.queCome();
                    Animal caballo = new Caballo("Spark", "Pasto", 25,"Fino");
                    caballo.queCome();
                    break;
                case "2":
                    /* Vamos a crear una Lavadora y un Televisor y llamar a los
                    métodos necesarios para mostrar el precio final de los dos 
                    electrodomésticos. */
                    Electrodomestico lavadora = new Lavadora(50, 50, "Lila", 'O', 50);
                    Electrodomestico televisor = new Televisor(45,true,25,"ROJO",'A',50);
                    lavadora.precioFinal();
                    televisor.precioFinal();
                    System.out.println("Precio de la lavaropas color " + lavadora.getColor() + " con un consumo tipo "+ lavadora.getConsumoEnergetico() + " es de " + lavadora.getPrecio());
                    System.out.println("Precio del televisor " + televisor.getColor() + " con un consumo tipo "+ televisor.getConsumoEnergetico() + " es de " + televisor.getPrecio());
                    break;
                case "3":
                    // En el main se crearán las formas y se mostrará el resultado final.
                    Circulo circulo = new Circulo(15);
                    circulo.calcularAres();
                    circulo.calcularPerimetro();
                    Rectangulo rectangulo = new Rectangulo(15,30);
                    rectangulo.calcularAres();
                    rectangulo.calcularPerimetro();
                    break;
                case "4":
                    /*Luego en una clase TestHerencia, desde su método main se pide:
                a. Crear un Guerrero de nombre “Thor” en la posición X=100, Y=200
                b. Hacerlo girar hasta que mire al Oeste
                c. Hacerlo Avanzar 5 pasos.
                d. Hacerlo disparar 8 veces.*/
                    Position posicion = new Position(100, 200);
                    Guerrero thor = new Guerrero(true, posicion, "Thor");
                    thor.toString();
                    while (thor.orientacion == 'O') {
                        thor.girar();
                    }
                    boolean estAnterior = thor.isCaballo();
                    if (thor.isCaballo()) {
                        thor.setCaballo(false);
                    }
                    for (int i = 1; i <= 5; i++) {
                        thor.avanzar();
                    }
                    thor.setCaballo(estAnterior);
                    for (int i = 1; i <= 8; i++) {
                        thor.disparar();
                    }
                    System.out.println(thor.toString());

            }
        } while (!vResp.toUpperCase().equals("S"));
        JOptionPane.showMessageDialog(null, "Gracias por usar nuestros software!!");

    }

}
