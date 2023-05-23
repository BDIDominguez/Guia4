/*
Crear una clase de nombre Guerrero que es un Personaje con los siguientes atributos adicionales:
-caballo de tipo bool.
Con los métodos:
Sobreescribir el comportamiento de Avanzar para que si tiene un caballo avanzará de a 10 pasos caso contrario 
se comportará como el método de la clase padre.
Sobreescribir el comportamiento de Disparar para que si tiene menos de 30 unidades de energía pierda el caballo.
 */
package guia4;

/**
 *
 * @author Dario
 */
public class Guerrero extends Personaje {
    private boolean caballo;

    public Guerrero(boolean caballo, Position ubicacion, String nick) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
    
    
    @Override
    public void avanzar(){
        if (caballo){
            System.out.println("que lindo es avanzar con un caballo avanzando 10 pasos");
            for (int i = 1; i<= 10; i++){
                super.avanzar();
            }
        }else{
            System.out.println("Tienes que conseguirte un caballo avanzando 1 paso");
            super.avanzar();
        }
    }
    @Override
    public void disparar(){
        if (energia<30){
            caballo = false;
            System.out.println("Te has quedado sin caballo");
        }
        super.disparar();
    }

    @Override
    public String toString() {
        return "Guerrero{" + "caballo=" + caballo + '}';
    }

   
    
}
