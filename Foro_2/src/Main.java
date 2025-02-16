// Clase principal que contiene el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear una lista enlazada de empleados
        ListaEnlazada lista = new ListaEnlazada();

        // Agregar empleados a la lista
        lista.agregarEmpleado(new Empleado(1, "Carlos Alberto", "Martínez Rodríguez", "M", 2952670.00));
        lista.agregarEmpleado(new Empleado(2, "Teresa", "Nicolás Otaño", "F", 2338617.00));
        lista.agregarEmpleado(new Empleado(3, "Rosa Alquidia", "Lázala Polanco", "F", 2355228.00));
        lista.agregarEmpleado(new Empleado(4, "Ivellisse", "Estévez Ventura", "M", 1801728.00));
        lista.agregarEmpleado(new Empleado(5, "Margarita", "Núñez de la Cruz", "F", 3124269.00));
        lista.agregarEmpleado(new Empleado(6, "Belkis Josefina", "Hernández", "F", 2975450.00));
        lista.agregarEmpleado(new Empleado(7, "Ruth", "Ortega", "F", 2306902.00));
        lista.agregarEmpleado(new Empleado(8, "Lourdes", "Florentino de la Cruz", "F", 2583729.00));
        lista.agregarEmpleado(new Empleado(9, "Luisa", "Mejía", "F", 2160378.00));
        lista.agregarEmpleado(new Empleado(10, "Cándido Mercedes", "Vargas", "M", 1961114.00));

        // Imprimir la lista original
        System.out.println("Lista original:");
        lista.imprimirLista();

        // Ordenar la lista por salario
        lista.ordenarPorSalario();

        // Imprimir la lista ordenada
        System.out.println("\nLista ordenada por salario:");
        lista.imprimirLista();
    }
}