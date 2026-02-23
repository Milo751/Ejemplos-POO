package ProyectoNotificaciones;

public class SMSNotification extends Notification implements Loggable {

    private String phoneNumber;

    public SMSNotification(String recipient, String message, Priority priority, String phoneNumber) {
        super(recipient, message, priority);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        System.out.println("Esto es para Github");
        return phoneNumber;
    }

    @Override
    public void send() {
        System.out.println("Enviando SMS a " + phoneNumber +
                " prioridad " + priority);
    }

    @Override
    public void logMessage() {
        System.out.println("[LOG] SMS enviado a " + phoneNumber);
    }
}

