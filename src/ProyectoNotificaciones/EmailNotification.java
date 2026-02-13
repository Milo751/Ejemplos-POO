package ProyectoNotificaciones;

public class EmailNotification extends Notification implements Loggable {

    private String emailAddress;

    public EmailNotification(String recipient, String message, Priority priority, String emailAddress) {
        super(recipient, message, priority);
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void send() {
        System.out.println("Enviando EMAIL a " + emailAddress +
                " prioridad " + priority);
    }

    @Override
    public void logMessage() {
        System.out.println("[LOG] Email enviado a " + emailAddress);
    }
}

