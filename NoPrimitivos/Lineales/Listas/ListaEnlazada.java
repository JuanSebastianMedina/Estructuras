// ejemplo completo


public class ListaEnlazada {
    public static void ListaEnlazada(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();

        lista.insertarInicio(10);
        lista.insertarInicio(5);
        lista.insertarFinal(20);
        lista.insertarFinal(30);

        lista.mostrar(); // 5 -> 10 -> 20 -> 30 -> null

        lista.eliminar(10);
        lista.mostrar(); // 5 -> 20 -> 30 -> null
    }
}
// estructura del nodo
class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
// lista enlazada
class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada() {
        cabeza = null;
    }
}
// insercion al inicio
public void insertarInicio(int dato) {
    Nodo nuevo = new Nodo(dato);
    nuevo.siguiente = cabeza;
    cabeza = nuevo;
}
// insercion al final
public void insertarFinal(int dato) {
    Nodo nuevo = new Nodo(dato);

    if (cabeza == null) {
        cabeza = nuevo;
        return;
    }

    Nodo actual = cabeza;
    while (actual.siguiente != null) {
        actual = actual.siguiente;
    }

    actual.siguiente = nuevo;
}
// recorrer la lista
public void mostrar() {
    Nodo actual = cabeza;

    while (actual != null) {
        System.out.print(actual.dato + " -> ");
        actual = actual.siguiente;
    }

    System.out.println("null");
}
// eliminar
public void eliminar(int dato) {
    if (cabeza == null) return;

    if (cabeza.dato == dato) {
        cabeza = cabeza.siguiente;
        return;
    }

    Nodo actual = cabeza;

    while (actual.siguiente != null) {
        if (actual.siguiente.dato == dato) {
            actual.siguiente = actual.siguiente.siguiente;
            return;
        }
        actual = actual.siguiente;
    }
}
