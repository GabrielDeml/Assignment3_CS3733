public class SalesAssociate extends Employee {

//    SalesAssociate(String) {
//
//    }

    protected String employeeName;
    protected SalesManager manager;

    double bonus() {
        return _clients.size();
    }

    public SalesManager getManager() {
        return manager;
    }

    public void setManager(SalesManager manager) {
        this.manager = manager;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}

