public class Bank {
    private Customer[] customers = new Customer[5];
    private int numberofCustomers;

    public Bank(){
        numberofCustomers = 0;
    }

    public void addCustomer(String f, String l){
        if (numberofCustomers < 5){
            customers[numberofCustomers++] = new Customer(f, l);
        }
    }
    public int getNumOfCustomers(){
        return numberofCustomers;
    }
    public Customer getCustomer(int customer_index){
        return customers[customer_index];
    }
}
