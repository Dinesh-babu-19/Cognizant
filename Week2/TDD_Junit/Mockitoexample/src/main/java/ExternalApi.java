public interface ExternalApi {
    String getData();
    void sendData(String data);
    void sendNotification(String message);
}