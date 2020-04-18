import java.util.ArrayList;

public abstract class Employee {
    protected long salesID;
    private ArrayList<Client> _clients = new ArrayList<Client>();
    protected String employeeName;

    public Employee(String name, long salesID) {
        this.employeeName = name;
        this.salesID = salesID;
    }

    public Boolean addClient(Client client) {
        for (int i = 0; i <_clients.size(); i++) {
            if (_clients.get(i).equals(client)) {
                return false;
            }
        }
        this._clients.add(client);
        return true;
    }

    ArrayList<Client> getClients() {
        return _clients;
    }

    public long getSalesID() {
        return this.salesID;
    }

    public void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    protected int numberOfClients() {
        return this._clients.size();
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
