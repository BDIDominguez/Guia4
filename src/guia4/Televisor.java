/*
Se debe crear también una subclase llamada Televisor con los siguientes 
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además 
de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos 
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método precioFinal(): este método será heredado y se le sumará la siguiente 
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, 
aumentará $500. Recuerda que las condiciones que hemos visto en la clase 
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios 
para mostrar el precio final de los dos electrodomésticos. */
package guia4;

/**
 *
 * @author Dario
 */

public class Televisor extends Electrodomestico{
    private int resolucion; // en pulgadas
    private boolean sintonizadorTDT;

    public Televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor() {}
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (resolucion > 40){
            precio = precio + (precio*30/100);
        }
        if (sintonizadorTDT){
            precio = precio + 500;
        }
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    
    
    
}
