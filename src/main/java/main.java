public class main {
    public static void main(String[] args){
        SalesManager Sam = new SalesManager("Sam", 3);
        SalesManager Charlie = new SalesManager("Charlie", 4);
        SalesAssociate Sven = new SalesAssociate("Sven", 7, Charlie);
        SalesAssociate Alex = new SalesAssociate("Alex", 20, Sam);
        Client Jo = new Client(32, "Jo", Sam);
        Sam.addClient(Jo);
        Client Riley = new Client(473, "Riley", Sam);
        Sam.addClient(Riley);
        Client Peyton = new Client(555, "Peyton", Sven);
        Sven.addClient(Peyton);
        Client Avery = new Client(654, "Avery", Charlie);
        Charlie.addClient(Avery);
        Client Taylor = new Client(840, "Taylor", Alex);
        Alex.addClient(Taylor);
        Client Remi = new Client(912, "Remi", Alex);
        Alex.addClient(Remi);


        System.out.println("Sales Manager: " + Sam.getEmployeeName() + ". Employees: " + getEmployeesString(Sam) + "Clients: " + getClientsString(Sam));

        System.out.println("Client: " + Jo.get_clientName() + ". Sales Employee: " + Jo.get_salesEmployee().getEmployeeName());
        System.out.println("Client: " + Riley.get_clientName() + ". Sales Employee: " + Riley.get_salesEmployee().getEmployeeName());
        System.out.println("Client: " + Peyton.get_clientName() + ". Sales Employee: " + Peyton.get_salesEmployee().getEmployeeName());
        System.out.println("Client: " + Avery.get_clientName() + ". Sales Employee: " + Avery.get_salesEmployee().getEmployeeName());
        System.out.println("Client: " + Taylor.get_clientName() + ". Sales Employee: " + Taylor.get_salesEmployee().getEmployeeName());
        System.out.println("Client: " + Remi.get_clientName() + ". Sales Employee: " + Remi.get_salesEmployee().getEmployeeName());
    }

    static private String getEmployeesString(SalesManager salesManager) {
        StringBuilder associates = new StringBuilder();
        String prefix = "";
        for(int i = 0; i < salesManager.getEmployees().size(); i++) {
            associates.append(prefix);
            associates.append(salesManager.getEmployees().get(i));
            prefix = ". ";
        }
        return associates.toString();
    }
    static private String getClientsString(Employee employee) {
        StringBuilder associates = new StringBuilder();
        String prefix = "";
        for(int i = 0; i < employee.getClients().size(); i++) {
            associates.append(prefix);
            associates.append(employee.getClients().get(i).get_clientName());
            associates.append(" ");
            associates.append(employee.getClients().get(i).get_clientID());
            prefix = ", ";
        }
        associates.setLength(associates.length() -1);
        return associates.toString();
    }
}
