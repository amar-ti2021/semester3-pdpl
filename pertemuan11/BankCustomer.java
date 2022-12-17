import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BankCustomer extends BankDetails implements CreditCard {
    public void givenBankDetails() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name : ");
            String customer_name = br.readLine();

            System.out.println("");

            System.out.print("Enter the account number :");
            long account_number = Long.parseLong(br.readLine());

            System.out.println("");

            System.out.print("Enter the bank name : ");
            String bank_name = br.readLine();

            setAccHolderName(customer_name);
            setAccNumber(account_number);
            setBankName(bank_name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getCreditCard() {
        long account_number = getAccNumber();
        String account_holder_name = getAccHolderName();
        String bank_name = getBankName();

        return ("The Account Number" + account_number + " of " + account_holder_name +
                " in " + bank_name + " bank is valid an authenticated for issuing credit card");
    }
}
