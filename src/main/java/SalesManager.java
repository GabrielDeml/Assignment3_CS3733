import java.util.ArrayList;

public class SalesManager extends Employee{
    protected String employeeName;
    private ArrayList<Employee> _employees;
    protected SalesManager manager;

    double bonus() { return -1; }

    protected String getEmployeeName() {
        return employeeName;
    }


}
