package ProyectoNotificaciones;

public class PushNotification extends Notification implements Loggable {

    private String deviceId;

    public PushNotification(String recipient, String message, Priority priority, String deviceId) {
        super(recipient, message, priority);
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    @Override
    public void send() {
        System.out.println("Enviando PUSH a device " + deviceId +
                " prioridad " + priority);
    }

    @Override
    public void logMessage() {
        System.out.println("[LOG] Push enviado a device " + deviceId);
    }
}

