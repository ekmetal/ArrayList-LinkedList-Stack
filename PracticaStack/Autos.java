package PracticaStack;

// 3. Crear una stack que permita objetos de tipo Autos, donde cada objeto auto debe tener: num_patente, marca, modelo, color, chasis.
//    Cargar la pila con 7 autos diferentes luego hacer lo siguiente:

// a. Buscar un auto de color rojo.
// b. Mostrar el auto que se encuentra en la cima de la pila.
// c. Borrar el auto que se encuentra en la cima de la pila.
// d. Agregar dos nuevos autos a la pila.
// Recorrer la pila mostrando el nuevo contenido luego de las operaciones realizadas.

public class Autos {
    private String num_patente;
    private String marca;
    private String modelo;
    private String color;
    private int chasis;
    
    // CONSTRUCTORES
    public Autos() {
    }
    public Autos(String num_patente, String marca, String modelo, String color, int chasis) {
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.chasis = chasis;
    }

    // GETTERS AND SETTERS
    public String getNum_patente() {
        return num_patente;
    }
    public void setNum_patente(String num_patente) {
        this.num_patente = num_patente;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getChasis() {
        return chasis;
    }
    public void setChasis(int chasis) {
        this.chasis = chasis;
    }
}
