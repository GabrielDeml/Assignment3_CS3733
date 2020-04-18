public class Client {
    private int _clientID;
    private String _clientName;
    private Employee _salesEmployee;

    public static int getClientCount() {
        return clientCount;
    }

    public static void setClientCount(int clientCount) {
        Client.clientCount = clientCount;
    }

    private static int clientCount;

    public Client(int clientID, String clientName, Employee salesEmployee) {
        this._clientID = clientID;
        this._clientName = clientName;
        this._salesEmployee = salesEmployee;
    }

    double totalSales() { return -1; }

    public int get_clientID() {
        return _clientID;
    }

    public void set_clientID(int _clientID) {
        this._clientID = _clientID;
    }

    public String get_clientName() {
        return _clientName;
    }

    public void set_clientName(String _clientName) {
        this._clientName = _clientName;
    }
}
