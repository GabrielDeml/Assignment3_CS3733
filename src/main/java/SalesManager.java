import java.util.ArrayList;

public class SalesManager extends Employee {


    private ArrayList<Employee> employees = new ArrayList<Employee>();
    protected SalesManager manager;

    public SalesManager(String name, long salesID) {
        super(name, salesID);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public SalesManager getManager() {
        return manager;
    }

    public void setManager(SalesManager manager) {
        this.manager = manager;
    }

    double bonus() {
        return this.numberOfClients() * 10000;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
}
