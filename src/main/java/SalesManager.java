import java.util.ArrayList;

public class SalesManager extends Employee {
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    protected String employeeName;
    private ArrayList<Employee> employees;
    protected SalesManager manager;
    double bonus(){return -1.0;}
}
