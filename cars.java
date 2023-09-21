import javax.swing.*;
public class cars {
    public static void main (String[] args)
    {
       String userinput;
       Double distance;
       userinput = JOptionPane.showInputDialog(null, 
       "Enter the distance kilometer: ");
       distance = Double.parseDouble(userinput);
       String userinput1;
       Double fuel;
       userinput1 = JOptionPane.showInputDialog(null, 
       "Enter the Fuel Efficiency(per gallon): ");
       fuel = Double.parseDouble(userinput1);
       String userinput2;
       Double price;
       userinput2 = JOptionPane.showInputDialog(null, 
       "Enter the price per gallon: ");
       price = Double.parseDouble(userinput2);
       
       double fuelNeed = distance / fuel; 
       double tripCost = fuelNeed * price;   
  
       JOptionPane.showMessageDialog(null,"The cost of the trip is: " + tripCost); 
    }
}               


