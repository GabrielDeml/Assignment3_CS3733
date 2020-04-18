public class Client {
    private int _clientID;
    private String _clientName;
    private Employee _salesEmployee;
    private static int _clientCount = 0;

    public Client(int clientID, String clientName, Employee salesEmployee) {
        this._clientID = clientID;
        this._clientName = clientName;
        this._salesEmployee = salesEmployee;
        this._salesEmployee.addClient(this);
    }


    double totalSales() { return -1; }

    public int get_clientID() {
        return _clientID;
    }

    public void set_clientID(int _clientID) {
        this._clientID = _clientID;
    }

    public Employee get_salesEmployee() {
        return _salesEmployee;
    }

    public void set_salesEmployee(Employee _salesEmployee) {
        this._salesEmployee = _salesEmployee;
    }

    public String get_clientName() {
        return _clientName;
    }

    public void set_clientName(String _clientName) {
        this._clientName = _clientName;
    }

    public static int get_clientCount() {
        return _clientCount;
    }
}
