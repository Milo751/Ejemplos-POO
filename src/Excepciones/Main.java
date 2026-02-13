package Excepciones;

public class Main {
    static void main(String[] args) {
        //int result = 10 / 0;
        //System.out.println(result);

        // try/catch
        try {
            int result2 = 10 / 0;
            System.out.println(result2);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }

        System.out.println("El programa continúa");

        // Finally
        try {
            int result3 = 10 / 2;
            System.out.println(result3);
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Esto siempre se ejecuta");
        }

        // Multiples catch
        try {
            int[] numbers = {1,2,3};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango");
        } catch (Exception e) {
            System.out.println("Error general");
        }
    }
}
