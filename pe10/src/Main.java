public class Main {
    public static void main(String[] args) {

        Person aPerson = new Person("Guillaume", "777 street", "555-8");
        Customer aCustomer = new Customer("Maëlys", "777 street", "555-2", 1818, true);

        System.out.println( aPerson.getName() );
        System.out.println( aCustomer.getName() );
        System.out.println( aCustomer.getCustomerNumber() );
    }
}
