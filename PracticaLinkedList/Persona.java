package PracticaLinkedList;

// 2. Crear una clase persona que tenga los siguientes atributos: dni, nombre, apellido, dirección, celular, edad
// (tener en cuenta todos sus atributos, constructores y métodos getters y setters). A partir de ello:

// a. Crear una LinkedList de tipo Persona y agregar 20 personas distintas.
// b. Crear dos LinkedLists de tipo Persona diferentes a la primera, una para almacenar a los menores de edad y otra para los mayores.
// c. Recorrer la lista principal buscando a las personas que sean mayores de 18 años. En caso que una persona tenga o sea mayor a 18 años, 
//    agregarla a la lista de mayores, caso contrario agregarla a una lista de menores.
// d. Una vez realizada la separación, recorrer ambas nuevas listas y mostrar por pantalla el nombre, apellido y edad de cada una de las personas
//  contenidas en cada lista.


public class Persona {
    
    private int num;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private int edad;
    
    // CONSTRUCTORES
    public Persona() {
    }
    
    public Persona(int num, String nombre, String apellido, String direccion, String celular, int edad) {
        this.num = num;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
        this.edad = edad;
    }
    
    
    // GETTERS AND SETTERS
        public int getNum() {
            return num;
        }
    
        public void setNum(int num) {
            this.num = num;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getCelular() {
            return celular;
        }

        public void setCelular(String celular) {
            this.celular = celular;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
        
}// Cierra class
