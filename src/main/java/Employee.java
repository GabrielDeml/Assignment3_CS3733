import java.util.ArrayList;

public abstract class Employee {
    protected long salesID;
    private ArrayList<Client> _clients;

    public Boolean addClient(String client) {
        for (int i = 0; i <_clients.size(); i++) {
            if (_clients.get(i).get_clientName().equals(client)) {
                return false;
            }
        }
        int clientCount = Client.get_clientCount();
        _clients.add(new Client(clientCount+1, "name"+clientCount, this));
        return true;
    }

    private ArrayList<Client> getClients() {
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
}
