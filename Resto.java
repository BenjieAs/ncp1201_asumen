import javax.swing.JOptionPane;
public class Resto {
    public static void main (String[] args)
    {
        Double bill;
        bill = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Input the bill: "));
        Double tip;
        tip = Double.parseDouble(JOptionPane.showInputDialog(null,
        "Input your tip: ")); 

        double totaltip = ((bill * tip) / 100);
        double totalbill = bill + totaltip;
        JOptionPane.showMessageDialog(null,"The total tip is: " + totaltip +
        "\nThe total bill is: " + totalbill);
    }
}               


