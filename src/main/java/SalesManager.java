import java.util.ArrayList;
import java.util.List;

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

    public SalesManager getManaager() {
        return manaager;
    }

    public void setManaager(SalesManager manaager) {
        this.manaager = manaager;
    }

    public long getSalesID() {
        return salesID;
    }

    public void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    protected String employeeName;
    private ArrayList<Employee> employees;
    protected SalesManager manaager;
    protected long salesID;
    double bonus(){return -1.0;}
}
