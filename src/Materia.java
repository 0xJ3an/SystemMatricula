import java.util.Scanner;
public class Materia {
    private String nombre;
    private String codigo;
    private int numHoras;
    private Profesor profesor1;
    private Profesor profesor2;

    public Materia(){
        ingresarDatos();
    }

    public void ingresarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la materia:");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el código de la materia:");
        codigo = scanner.nextLine();
        System.out.println("Ingrese el número de horas:");
        numHoras = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese los datos del primer profesor:");
        profesor1 = new Profesor();
        System.out.println("Ingrese los datos del segundo profesor:");
        profesor2 = new Profesor();
    }

    public void imprimirHoras() {
        System.out.println("Número de horas: " + numHoras);
    }

    public void imprimirProfesores() {
        System.out.println("Profesor 1:");
        profesor1.imprimirDatos();
        System.out.println("Profesor 2:");
        profesor2.imprimirDatos();
    }
}
