public class ListaEnlazada {
    private Nodo cabeza; // Primer nodo de la lista

    // Constructor para inicializar una lista vacía
    public ListaEnlazada() {
        this.cabeza = null;
    }

    // Método para agregar un empleado a la lista
    public void agregarEmpleado(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para ordenar la lista por salario usando el algoritmo de burbuja
    public void ordenarPorSalario() {
        if (cabeza == null || cabeza.getSiguiente() == null) {
            return; // La lista está vacía o tiene un solo elemento, no hay nada que ordenar
        }

        boolean intercambio;
        int iteracion = 1; // Contador de iteraciones
        do {
            intercambio = false;
            Nodo actual = cabeza;
            Nodo anterior = null;

            while (actual != null && actual.getSiguiente() != null) {
                if (actual.getEmpleado().getSalario() > actual.getSiguiente().getEmpleado().getSalario()) {
                    // Intercambiar nodos
                    Nodo siguiente = actual.getSiguiente();
                    actual.setSiguiente(siguiente.getSiguiente());
                    siguiente.setSiguiente(actual);

                    if (anterior == null) {
                        cabeza = siguiente; // Si el intercambio es en la cabeza, actualizar la cabeza
                    } else {
                        anterior.setSiguiente(siguiente);
                    }

                    intercambio = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }

            // Imprimir la lista después de cada iteración
            System.out.println("\nIteración " + iteracion + ":");
            imprimirLista();
            iteracion++; // Incrementar el contador de iteraciones

        } while (intercambio);
    }

    // Método para imprimir la lista de empleados
    public void imprimirLista() {
        Nodo actual = cabeza;
        System.out.println("+----+-----------------+----------------------+--------+-------------+");
        System.out.println("| ID | Nombre          | Apellido             | Género | Salario     |");
        System.out.println("+----+-----------------+----------------------+--------+-------------+");
        while (actual != null) {
            System.out.println(actual.getEmpleado());
            actual = actual.getSiguiente();
        }
        System.out.println("+----+-----------------+----------------------+--------+-------------+");
    }
}