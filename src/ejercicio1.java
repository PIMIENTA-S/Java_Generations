import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio1 {
    public static void calcularPromedio(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese calificación 1: ");
        int nota1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese calificación 2: ");
        int nota2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese calificación 3: ");
        int nota3 = Integer.parseInt(scanner.nextLine());

        scanner.close();


        System.out.println("Su promedio es " + ((nota1 + nota2 + nota3) / 3));





    }
}
