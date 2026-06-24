public class MyService {

    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    public void processData(String data) {
        api.sendData(data);
    }

    public void notifyUser() {
        api.sendNotification("Welcome User");
    }
}