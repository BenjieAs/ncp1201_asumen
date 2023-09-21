import javax.swing.*;
public class Fav {
    public static void main (String[] args){
       String userinput;
       Double num;
       userinput = JOptionPane.showInputDialog(null, "Enter Number ^_^: ");
       num = Double.parseDouble(userinput);

       if (num % 3 == 0 && num % 5 == 0) {
        JOptionPane.showMessageDialog(null,"HEP -- HEPPPPP HOOOOORAYYYYYYY -_-" );
    } else if (num % 3 == 0) {
        JOptionPane.showMessageDialog(null,"HEPPP -- HEPPPPP *_*" );
    } else if (num % 5 == 0) {
        JOptionPane.showMessageDialog(null,"HOOOOOORAYYYYYYY >_<" );
    } else {
        JOptionPane.showMessageDialog(null,"OHHH NOoOOO !!" );
    }
    }
}


