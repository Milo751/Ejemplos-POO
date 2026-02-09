package POO.Polimorfismo;

public class Receipt {

    private String id;
    private String date;

    public Receipt(String id, String date) {
        this.id = id;
        this.date = date;
    }

    public void printReceipt() {
        System.out.println("Recibo ID: " + id + " | Fecha: " + date);
    }
}

