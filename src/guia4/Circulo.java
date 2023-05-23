/*
Se plantea desarrollar un programa que nos permita calcular el área y el 
perímetro de formas geométricas, en este caso un círculo y un rectángulo. 
Ya que este cálculo se va a repetir en las dos formas geométricas, vamos a 
crear una Interfaz, llamada calculosFormas que tendrá, los dos métodos para 
calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la 
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán 
las formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
 */
package guia4;

public class Circulo implements calculosFormas{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del circulo es de " + (PI*(radio*2)));
    }

    @Override
    public void calcularAres() {
        System.out.println("el area del circulo es " + (PI*(radio*radio)));
    }

}
