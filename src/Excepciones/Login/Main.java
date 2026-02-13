package Excepciones.Login;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("Ingrese su correo: ");
                String correo = scanner.nextLine();

                System.out.print("Ingrese su contraseña: ");
                String password = scanner.nextLine();

                // Simulación de validación
                if (correo.isEmpty() || password.isEmpty()) {
                    throw new Exception("No se ingresaron datos completos");
                }

                if (correo.equals("admin@mail.com") && password.equals("1234")) {
                    System.out.println("Inicio de sesión exitoso ✅");
                } else {
                    System.out.println("Credenciales incorrectas ❌");
                }

            } catch (Exception e) {
                System.out.println("Ocurrió un error durante el inicio de sesión: " + e.getMessage());

            } finally {
                System.out.println("El proceso de inicio de sesión ha finalizado.");
                scanner.close();
            }
        }
}
