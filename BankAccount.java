import javax.swing.*;

public class BankAccount 
{
    public static void main(String[] args)
    {
        double balance = 1000;
        
        String[] choices = {"[ Check Balance ]", "[ Withdraw ]", "[ Deposit ", "[ QUIT ]"};
        int choice = JOptionPane.showOptionDialog(null,
            "Choose Transaction","Bank Central", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE , null , choices , choices[0]);
            if (choice == 0) {
                checkBalance();
            } else if (choice == 1) {
                Angles();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid !!. Please choose '[1]' or '[2]'.",
                "NOTE!!", JOptionPane.PLAIN_MESSAGE);
            }

    }
    public static void checkBalance();

}
