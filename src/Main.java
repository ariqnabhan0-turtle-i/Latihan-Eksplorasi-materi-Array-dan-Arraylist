public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Budi", "Santoso");
        bank.addCustomer("Siti", "Aminah");
        bank.addCustomer("Andi", "Pratama");

        bank.getCustomer(0).setAccount(new Account(1_000_000));
        bank.getCustomer(0).setAccount(new Account(200_000));
        bank.getCustomer(1).setAccount(new Account(500_000));
        bank.getCustomer(2).setAccount(new Account(750_000));

        Customer[] customers = new Customer[bank.getNumOfCustomers()];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = bank.getCustomer(i);
        }

        boolean depositSucceeded = customers[0].getAccount(0).deposit(250_000);
        boolean withdrawalSucceeded = customers[1].getAccount(0).withdraw(100_000);
        boolean failedWithdrawal = customers[2].getAccount(0).withdraw(900_000);
        System.out.println("Setor Budi berhasil: " + depositSucceeded);
        System.out.println("Penarikan Siti berhasil: " + withdrawalSucceeded);
        System.out.println("Penarikan Andi berhasil: " + failedWithdrawal);
        System.out.println();

        for (Customer customer : customers) {
            System.out.println("Nasabah: " + customer.getFirstName() + " "
                    + customer.getLastName());

            for (int j = 0; j < customer.getNumOfAccounts(); j++) {
                System.out.println("  Rekening " + (j + 1) + ": Rp"
                        + customer.getAccount(j).getBalance());
            }
        }
    }
}
