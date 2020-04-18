public class SalesAssociate extends Employee{
    protected String employeeName;
    protected SalesManager manager;

    double bonus() { return -1; }

    protected String getEmployeeName() {
        return employeeName;
    }

    protected SalesManager getManager() {
        return manager;
    }

    protected void setEmployeeNames(String newEmpName) {
        employeeName = newEmpName;
    }

    protected void setManager(SalesManager newMan) {
        manager = newMan;
    }
}
