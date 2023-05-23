/*
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
*/
package guia4;

/**
 *
 * @author Dario
 */
public class Rectangulo implements calculosFormas{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del rectangulo es " + ((base + altura) * 2));
    }

    @Override
    public void calcularAres() {
        System.out.println("El area del rectangulo es " + (base*altura));
    }
    
}
