public import java.util.HashMap;
import java.util.Map;

public class BankingAccountManagement {
    public static void main(String[] args) {

        HashMap<Integer, Double> accounts = new HashMap<>();

        accounts.put(1001, 5000.0);
        accounts.put(1002, 10000.0);
        accounts.put(1003, 7500.0);

        System.out.println("Bank Accounts:");
        System.out.println(accounts);

        int depositAccount = 1001;
        double depositAmount = 2000;

        if (accounts.containsKey(depositAccount)) {
            accounts.put(depositAccount,
                    accounts.get(depositAccount) + depositAmount);
            System.out.println("\nMoney Deposited Successfully");
        }

        int withdrawAccount = 1002;
        double withdrawAmount = 3000;

        if (accounts.containsKey(withdrawAccount)) {
            accounts.put(withdrawAccount,
                    accounts.get(withdrawAccount) - withdrawAmount);
            System.out.println("Money Withdrawn Successfully");
        }

        int checkAccount = 1003;

        if (accounts.containsKey(checkAccount)) {
            System.out.println("\nBalance of Account " + checkAccount + " = "
                    + accounts.get(checkAccount));
        } else {
            System.out.println("\nAccount Not Found");
        }

        int searchAccount = 1005;

        if (accounts.containsKey(searchAccount)) {
            System.out.println("Account Exists");
        } else {
            System.out.println("Cannot Perform Operation. Account Does Not Exist");
        }

        System.out.println("\nAll Account Details:");

        for (Map.Entry<Integer, Double> account : accounts.entrySet()) {
            System.out.println("Account No: " + account.getKey()
                    + " Balance: " + account.getValue());
        }

        double totalBalance = 0;

        for (double balance : accounts.values()) {
            totalBalance += balance;
        }

        System.out.println("\nTotal Balance in Bank: " + totalBalance);
    }

    
}
