import java.util.Scanner;
public class Estudiante {
    private int numeroMatricula;
    private String cedula;
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Estudiante() {
        ingresarDatos();
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de matrícula:");
        numeroMatricula = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.println("Ingrese la cédula del estudiante:");
        cedula = scanner.nextLine();
        System.out.println("Ingrese el nombre del estudiante:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese los datos de la materia 1:");
        materia1 = new Materia();
        System.out.println("Ingrese los datos de la materia 2:");
        materia2 = new Materia();
        System.out.println("Ingrese los datos de la materia 3:");
        materia3 = new Materia();
    }

    public void imprimirMaterias() {
        System.out.println("Materia 1:");
        materia1.imprimirHoras();
        materia1.imprimirProfesores();
        System.out.println("Materia 2:");
        materia2.imprimirHoras();
        materia2.imprimirProfesores();
        System.out.println("Materia 3:");
        materia3.imprimirHoras();
        materia3.imprimirProfesores();
    }


}
