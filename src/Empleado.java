// Clase Empleado que representa a un empleado con sus atributos
public class Empleado {
    private int id; // Identificador único del empleado
    private String nombre; // Nombre del empleado
    private String apellido; // Apellido del empleado
    private String genero; // Género del empleado
    private double salario; // Salario del empleado

    // Constructor para inicializar un objeto Empleado
    public Empleado(int id, String nombre, String apellido, String genero, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
    }

    // Métodos getters para acceder a los atributos privados
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public double getSalario() {
        return salario;
    }

    // Método toString para representar el objeto Empleado como una cadena de texto
    @Override
    public String toString() {
        return String.format("| %2d | %-15s | %-20s | %-6s | $%,10.2f |",
                id, nombre, apellido, genero, salario);
    }
}