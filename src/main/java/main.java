public class main {
    public static void main(String[] args){
        SalesManager Sam = new SalesManager("Sam", 3);
        SalesManager Charlie = new SalesManager("Charlie", 4);
        SalesAssociate Sven = new SalesAssociate("Sven", 7, Charlie);
        SalesAssociate Alex = new SalesAssociate("Alex", 20, Sam);
        Client Jo = new Client(32, "Jo", Sam);
        Client Riley = new Client(473, "Riley", Sam);
        Client Peyton = new Client(555, "Peyton", Sven);
        Client Avery = new Client(654, "Avery", Charlie);
        Client Taylor = new Client(840, "Taylor", Alex);
        Client Remi = new Client(912, "Remi", Alex);
    }
}
