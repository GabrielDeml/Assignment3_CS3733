import java.util.ArrayList;

public abstract class Employee {
    protected long salesID;

    public Boolean addClient(String client) {
        return true;
    }

    private ArrayList<Client> getClients() {
        return new ArrayList<Client>();
    }

    public long getSalesID() {
        return salesID;
    }

    public void setSalesID(long salesID) {
        this.salesID = salesID;
    }
}
