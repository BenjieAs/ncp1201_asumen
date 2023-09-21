import javax.swing.JOptionPane;
public class triangle {
    public static void main(String[] args) {
        String[] choices = {"[ 1 ]", "[ 2 ]"};
        int choice = JOptionPane.showOptionDialog(null,
            "\tClick 1 or 2 to determine the type of triangle ^_^\n \nPRESS: \n[1] = Side \n[2] = Angle",
            "TRIANGLE ?", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE , null , choices , choices[0]);
        if (choice == 0) {
            Sides();
        } else if (choice == 1) {
            Angles();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid !!. Please choose '[1]' or '[2]'.",
            "NOTE!!", JOptionPane.PLAIN_MESSAGE);
        }
    }
    public static void Sides() {
        double s1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 1:"));
        double s2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 2:"));
        double s3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 3:"));
        if (s1 == s2 && s2 == s3) {
            JOptionPane.showMessageDialog(null, "EQUILATERAL TRIANGLE -_-");
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            JOptionPane.showMessageDialog(null, "ISOSCELES TRIANGLE *_*");
        } else {
            JOptionPane.showMessageDialog(null, "SCALENE TRIANGLE >_<");
        }
    }
    public static void Angles() {
        double a1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of angle 1:"));
        double a2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of angle 2:"));
        double a3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of angle 3:"));
        if (a1 + a2 + a3 == 180) {
            if (a1 == 90 || a2 == 90 || a3 == 90) {
                JOptionPane.showMessageDialog(null, "RIGHT TRIANGLE -_-");
            } else if (a1 < 90 && a2 < 90 && a3 < 90) {
                JOptionPane.showMessageDialog(null, "ACUTE TRIANGLE *_*");
            } else {
                JOptionPane.showMessageDialog(null, "OBTUSE TRIANGLE >_<");
            }
        } else {
            JOptionPane.showMessageDialog(null,
            "Invalid angles. The angles should add up to 180 degrees.");
        }
    }
}
