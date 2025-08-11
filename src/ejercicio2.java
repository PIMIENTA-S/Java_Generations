import java.util.Scanner;

public class ejercicio2 {
    public static void user(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombreUser = scanner.nextLine();
        System.out.println("ingrese su edad: ");
        int edadUser = Integer.parseInt(scanner.nextLine());
        System.out.println("ingrese su nacionalidad: ");
        String nacionalidadUser = scanner.nextLine();
        System.out.println("ingrese su ocupacion: ");
        String ocupacionUser = scanner.nextLine();
        System.out.println("Ingrese su salario: ");
        float salarioUser = Float.parseFloat(scanner.nextLine());

        float naciomientoAnio = 2025 - edadUser;

        System.out.println("User: " + nombreUser);
        System.out.println("Fecha Nacimiento: " + naciomientoAnio);
        System.out.println("Edad: " + edadUser);
        System.out.println("Nacionalidad: " + nacionalidadUser);
        System.out.println("Ocupacion: " + ocupacionUser);
        System.out.println("Salario: " + salarioUser);




    }
}
