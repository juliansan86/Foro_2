// Clase Nodo que representa un nodo en una lista enlazada
public class Nodo {
    private Empleado empleado; // Datos del empleado
    private Nodo siguiente; // Referencia al siguiente nodo

    // Constructor para inicializar un nodo con un empleado
    public Nodo(Empleado empleado) {
        this.empleado = empleado;
        this.siguiente = null;
    }

    // Métodos getters y setters
    public Empleado getEmpleado() {
        return empleado;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}