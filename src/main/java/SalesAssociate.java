public class SalesAssociate extends Employee {

    protected SalesManager manager;

    public SalesAssociate(String name, long salesID, SalesManager manager) {
        super(name, salesID);
        this.manager = manager;
    }

    double bonus() {
        return this.numberOfClients() * 500;
    }

    public SalesManager getManager() {
        return manager;
    }

    public void setManager(SalesManager manager) {
        this.manager = manager;
    }
}

