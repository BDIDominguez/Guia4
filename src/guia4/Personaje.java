/*
 Crear una clase abstracta de nombre Personaje con los siguientes atributos:
-ubicación de tipo Position
-nick de tipo String
-vidas de tipo int inicializado en 3.
-energia de tipo int inicializado en 100.
-orientación de tipo char(‘N’ norte, ‘S’ sur, ‘E’ este, ‘O’ oeste). Inicializado en ‘N’
-un constructor que permita inicializar su ubicación y Nick.
Con los métodos:
Disparar que consume 10 unidades de energía y podrá disparar hasta que consuma toda su energía.
Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O…..
Avanzar que si el personaje está mirando hacia el norte: crece en 1 el valor Y 
de su posición; si está mirando al Sur: decrece en 1 el valor de Y, si mira al 
Este: crece en 1 el valor de X, y si mira al Oeste: decrece en 1 el valor de X.
 */

package guia4;

/**
 * @author Dario
 */

public abstract class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas=3;
    protected int energia=100;
    protected char orientacion = 'N';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }
    
    public void disparar(){
        if (energia > 10){
            System.out.println("Disparando....");
        }else{
            System.out.println("No tengo energia para disparar");
        }
    }
    // Girar que cambia secuencialmente de orientación N, E, S, O y vuelve nuevamente N,E,S,O…..
    public void girar(){
        switch (orientacion) {
            case 'N':
                orientacion = 'E';
                break;
            case 'E':
                orientacion = 'S';
                break;
            case 'S':
                orientacion = 'O';
                break;
            case 'O':
                orientacion = 'N';
                break;
        }
    }
    /* Avanzar que si el personaje está mirando hacia el norte: crece en 1 el valor Y 
    de su posición; si está mirando al Sur: decrece en 1 el valor de Y, si mira al 
    Este: crece en 1 el valor de X, y si mira al Oeste: decrece en 1 el valor de X. */
    
    public void avanzar() {
        switch (orientacion) {
            case 'N':
                ubicacion.setY(ubicacion.getY() + 1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY() - 1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX() + 1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX() - 1);
                break;
        }
    }

    @Override
    public String toString() {
        return "Personaje{" + "ubicacion=" + ubicacion + ", nick=" + nick + ", vidas=" + vidas + ", energia=" + energia + ", orientacion=" + orientacion + '}';
    }


}
