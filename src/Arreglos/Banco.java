package Arreglos;

class Cuenta {
    String titular;
    double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular + " - Saldo: " + saldo);
    }

    @Override
    public String toString() {
        return "Vos no podes ver la cuentas ome bobo";
    }
}

public class Banco {

    public static void main(String[] args) {

        // Array de objetos
        Cuenta[] cuentas = new Cuenta[3];

        // Inicializar objetos
        cuentas[0] = new Cuenta("Camilo", 1000);
        cuentas[1] = new Cuenta("Ana", 2000);
        cuentas[2] = new Cuenta("Luis", 1500);

        // Recorrer array
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i].mostrarInfo();
        }

        for (Cuenta aux : cuentas){
            System.out.println(aux);
        }


        Cuenta[] cuentasError = new Cuenta[3];
        cuentasError[0].mostrarInfo(); // ❌ NullPointerException
    }
}
