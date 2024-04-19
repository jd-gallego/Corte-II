import java.util.HashMap;

public class Libreria {
    private HashMap<String, Libro> inventario;
    private HashMap<String, Libro> prestamos;


    public Libreria() {
        this.inventario = new HashMap<>();
        this.prestamos = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        if (!inventario.containsKey(libro.getTitulo())) {
            inventario.put(libro.getTitulo(), libro);
            System.out.println("Libro agregado al inventario.");
        } else {
            System.out.println("El libro ya existe en el inventario.");
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        if (inventario.containsKey(titulo)) {
            Libro libro = inventario.get(titulo);
            System.out.println("Libro encontrado con el titulo: " + titulo);
            System.out.println(libro);
        } else {
            System.out.println("Libro no encontrado en el inventario.");
        }
    }

    public void buscarLibroPorAutor(String autor) {
        boolean encontrado = false;
        for (Libro libro : inventario.values()) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(libro);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Libros del autor no encontrado.");
        }
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de Libros:");
            for (Libro libro : inventario.values()) {
                System.out.println(libro);
            }
        }
    }

    public void realizarPrestamo(String tituloLibro, String nombreUsuario) {
        if (inventario.containsKey(tituloLibro)) {
            Libro libro = inventario.get(tituloLibro);
            System.out.println("El libro '" + libro.getTitulo() + "' fue prestado a: " + nombreUsuario);
            prestamos.put(tituloLibro, libro);
            inventario.remove(tituloLibro);
        } else {
            System.out.println("El libro no se encuentra en el inventario.");
        }
    }

    public void devolverLibro(String tituloLibro) {
        if (prestamos.containsKey(tituloLibro)) {
            Libro libroDevuelto = prestamos.get(tituloLibro);
            inventario.put(tituloLibro, libroDevuelto);
            prestamos.remove(tituloLibro);
            System.out.println("El libro '" + libroDevuelto.getTitulo() + "' fue devuelto con éxito.");
        } else {
            System.out.println("El libro no se encuentra en la lista de préstamos.");
        }
    }
}
