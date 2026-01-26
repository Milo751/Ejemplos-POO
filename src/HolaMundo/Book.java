package HolaMundo;

public class Book {
    String name = "El camino de los reyes";
    int pages = 1200;
    String author = "Brandon Sanderson";

    void open(boolean isOpen){
        if (isOpen) {
            System.out.println("El libro esta abierto");
        } else {
            System.out.println("El libro esta cerrado");
        }
    }
}
