/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

/**
 *
 * @author Dario
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, int peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
        
    }

    @Override
    public void precioFinal(){
        super.precioFinal();
        if (carga>30){
            precio = precio + 500;
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
}
