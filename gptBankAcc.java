import javax.swing.JOptionPane;

public class gptBankAcc {

    private static double balance = 1000;

    public static void main(String[] args) {
        while (true) {
            String[] options = {"Check Balance", "Withdraw", "Deposit", "Quit"};
            int choice = JOptionPane.showOptionDialog(null,
                    "Current Balance: $" + balance,
                    "Bank Transactions",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Your balance is: $" + balance);
                    break;

                case 1:
                    String withdrawAmountString = JOptionPane.showInputDialog("Enter the amount to withdraw:");
                    double withdrawAmount = Double.parseDouble(withdrawAmountString);
                    withdraw(withdrawAmount);
                    break;

                case 2:
                    String depositAmountString = JOptionPane.showInputDialog("Enter the amount to deposit:");
                    double depositAmount = Double.parseDouble(depositAmountString);
                    deposit(depositAmount);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Thank you for using our banking system.");
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }

    public static void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            JOptionPane.showMessageDialog(null, "Deposit successful. New balance: $" + balance);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive value.");
        }
    }

    public static void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                JOptionPane.showMessageDialog(null, "Withdrawal successful. New balance: $" + balance);
            } else {
                JOptionPane.showMessageDialog(null, "Insufficient funds.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid amount. Please enter a positive value.");
        }
    }
}
