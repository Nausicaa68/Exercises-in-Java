public class Customer extends Person {
    private int customerNumber;
    private boolean onMailingList;

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean onMailingList) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.onMailingList = onMailingList;
    }

    public Customer(){
        this.customerNumber = 0;
        this.onMailingList = false;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        this.onMailingList = onMailingList;
    }
}
