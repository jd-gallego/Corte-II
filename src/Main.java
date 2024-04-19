import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Libreria libreria = new Libreria();

        int opcion;
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Nuevo Libro");
            System.out.println("2. Buscar Libro por Título");
            System.out.println("3. Buscar Libro por Autor");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Realizar Préstamo");
            System.out.println("6. Devolver Libro Prestado");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Ingrese la editorial del libro: ");
                    String editorial = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación del libro: ");
                    int anoPublicacion = scanner.nextInt();
                    System.out.print("Ingrese el precio del libro: ");
                    double precio = scanner.nextDouble();
                    Libro nuevoLibro = new Libro(titulo, autor, isbn, editorial, anoPublicacion, precio);
                    libreria.agregarLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.print("Ingrese el título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    libreria.buscarLibroPorTitulo(tituloBuscar);
                    break;
                case 3:
                    System.out.print("Ingrese el autor de los libros a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    libreria.buscarLibroPorAutor(autorBuscar);
                    break;
                case 4:
                    libreria.mostrarInventario();
                    break;
                case 5:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloPrestamo = scanner.nextLine();
                    System.out.print("Ingrese el nombre del usuario que realiza el préstamo: ");
                    String nombreUsuario = scanner.nextLine();
                    libreria.realizarPrestamo(tituloPrestamo, nombreUsuario);
                    break;
                case 6:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloDevolucion = scanner.nextLine();
                    libreria.devolverLibro(tituloDevolucion);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese una opcion.");
                    break;
            }
        } while (opcion != 7);

    }
}