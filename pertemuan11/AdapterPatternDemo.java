public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard target_interface = new BankCustomer();
        target_interface.givenBankDetails();
        System.out.println(target_interface.getCreditCard());
    }
}
