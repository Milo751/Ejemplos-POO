package ProyectoNotificaciones;

public abstract class Notification {

    protected String recipient;
    protected String message;
    protected Priority priority;

    public Notification(String recipient, String message, Priority priority) {
        this.recipient = recipient;
        this.message = message;
        this.priority = priority;
    }

    // Método abstracto
    public abstract void send();
}
