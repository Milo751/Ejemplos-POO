package Constructores;

public class UsoThis {
    String nombre;

    public UsoThis() {
        this("Camilo");
    }

    UsoThis(String nombre) {
        this.nombre = nombre;
    }

    void saludar() {
        this.mostrarMensaje();
    }

    void mostrarMensaje() {
        System.out.println("Hola");
    }

    void register() {
        //Serivicio.guardar(this)
    }
}
