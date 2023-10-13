import java.util.Scanner;
public class Profesor {
    private String nombre;
    private String cedula;
    private String codigo;

    public Profesor(){
        ingresarDatos();
    }

    public void ingresarDatos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del profesor:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la cédula del profesor:");
        cedula = scanner.nextLine();
        System.out.println("Ingrese el código del profesor:");
        codigo = scanner.nextLine();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Código: " + codigo);
    }

}
