package ProyectoNotificaciones;

public class Main {
    public static void main(String[] args) {

        Notification n1 = new EmailNotification(
                "Ana",
                "Bienvenida!",
                Priority.HIGH,
                "ana@mail.com"
        );

        Notification n2 = new SMSNotification(
                "Carlos",
                "Código de verificación",
                Priority.MEDIUM,
                "+573001112233"
        );

        PushNotification n3 = new PushNotification(
                "Laura",
                "Tienes una nueva oferta",
                Priority.LOW,
                "A1B2C3"
        );

        // POLIMORFISMO
        System.out.println(((EmailNotification)n1).getEmailAddress());
        n1.send();
        ((Loggable)n1).logMessage();

        System.out.println();

        System.out.println(((SMSNotification)n2).getPhoneNumber());
        n2.send();
        ((Loggable)n2).logMessage();

        System.out.println();

        System.out.println(n3.getDeviceId());
        n3.setDeviceId("123FDS");
        System.out.println(n3.getDeviceId());
        n3.send();
        n3.logMessage();
    }
}

