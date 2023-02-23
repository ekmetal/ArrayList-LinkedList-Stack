package PracticaArrayList;

// 1.      Crear una clase Mascota, que tenga los siguientes atributos: nombre, especie, sexo, color, pelaje y raza 
// (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

// a  Crear un ArrayList de tipo Mascota. Crear 5 mascotas y guardarlas en la lista.
// b. Recorrer la lista creada y mostrar por pantalla el nombre, especie y pelaje de las mascotas almacenadas.
// c. Durante el recorrido, cambiar el nombre de dos mascotas. Volver a recorrer la lista y mostrar los nuevos datos
// d. Agregar dos nuevas mascotas a la lista.
// e. Recorrer la lista pero solo mostrando las mascotas que sean de la especie “perro”.

public class Mascota {
    
    private String nombre;
    private String especie;
    private String sexo;
    private String color;
    private String pelaje;
    private String raza;
    
    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // CONSTRUCTORES
    public Mascota() {
    }
    
    public Mascota(String nombre, String especie, String sexo, String color, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
    }
}
