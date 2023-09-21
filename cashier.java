import javax.swing.*;
public class cashier {
    public static void main(String[] args) {
        String changeInput = JOptionPane.showInputDialog("Enter the amount:");
        double change = Double.parseDouble(changeInput);

        int[] denominations = { 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 10, 5, 1 };
        String[] names = { "                  500s", "                  200s", "                  100s", "                  50s",
        "                  20s", "                  10s","                  5s", "                  1s", "                  10cs",
        "                  5cs", "                  1cs" };

        StringBuilder output = new StringBuilder("Quantity:   Change:\n");

        for (int i = 0; i < denominations.length; i++) {
            int count = (int) (change / denominations[i]);
            change -= count * denominations[i];

            if (count > 0) {
                output.append(count).append(" ").append(names[i]).append("\n");
            } else {
                output.append("-- ").append(names[i]).append("\n");
            }
        }
         JOptionPane.showMessageDialog(null, output.toString(), 
         "Change Amount Calcu", JOptionPane.INFORMATION_MESSAGE  );
    }
}
