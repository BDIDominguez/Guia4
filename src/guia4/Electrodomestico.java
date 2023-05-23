/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos: 
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es 
correcta, sino es correcta usara la letra F por defecto. Este método se debe 
invocar al crear el objeto y no será visible.
9
• Método comprobarColor(String color): comprueba que el color es correcto, y 
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el 
valor del precio. Esta es la lista de precios:

 */
package guia4;

/**
 *
 * @author Dario
 */
public class Electrodomestico {
    protected double precio;
    protected String color="BLANCO";
    protected char consumoEnergetico = 'F'; // (letras entre A y F)
    protected int peso;

    public Electrodomestico(double precio, String color, char consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomestico() {
    }
    
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
                break;
            default:
                letra = 'F';
                break;
        }
        return letra;
    }
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y 
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto y no será visible.
    */
    private String comprobarColor(String color){
        color = color.toUpperCase();
        switch (color){
            case "BLANCO": case "NEGRO": case "ROJO": case "AZUL": case "GRIS":
                break;
            default:
                color = "BLANCO";
                break;
        }
        return color;
    }
    public void precioFinal(){
        double precio1 = 0, precio2=0;
        switch (consumoEnergetico){
            case 'A':
                precio1 = 1000;
                break;
            case 'B':
                precio1 = 800;
                break;
            case 'C':
                precio1 = 600;
                break;
            case 'D':
                precio1 = 500;
                break;
            case 'E':
                precio1 = 300;
                break;
            case 'F':
                precio1 = 100;
                break;
        }
        if (peso <= 19 ){
            precio2 = 100;
        }else if (peso <= 49){
            precio2 =  500;
        }else if (peso<=79){
            precio2 =  800;
        }else{
            precio2 = 1000;
        }
        precio = precio + precio1 + precio2;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = comprobarColor(color);
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}

