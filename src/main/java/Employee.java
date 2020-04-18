import java.util.ArrayList;
public abstract class Employee{
    public Boolean addClient(String client) {
        return true;
    }
    private  ArrayList<Client> getClients() {
        return new ArrayList<Client>();
    }
}
