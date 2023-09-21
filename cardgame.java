import javax.swing.JOptionPane;

public class cardgame {
    public static void main(String[] args) {
        int firstCard = drawRandomCard();
        int secondCard = drawRandomCard();
        
        String[] dealOptions = {"DEAL", "NO DEAL"};
        int userChoice = JOptionPane.showOptionDialog(
            null,
            "First Card: " + firstCard + "\nSecond Card: " + secondCard + "\n\nDeal or No Deal?","IN-BETWEEN CARD GAME!!",
            JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, dealOptions, dealOptions[0]
        );
        
        if (userChoice == 0) {
            int thirdCard = drawRandomCard();
            
            if (isInBetween(thirdCard, firstCard, secondCard)) {
                JOptionPane.showMessageDialog(null, "YOU WIN!! ^_^\nThird Card: " + thirdCard);
            } else {
                JOptionPane.showMessageDialog(null, "YOU LOSE!! -_-\nThird Card: " + thirdCard);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You lose!");
        }
    }
    
    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1; // Simulate drawing a card from 1 to 13
    }
    
    public static boolean isInBetween(int card, int firstCard, int secondCard) {
        int min = Math.min(firstCard, secondCard);
        int max = Math.max(firstCard, secondCard);
        
        return card > min && card < max;
    }
}
