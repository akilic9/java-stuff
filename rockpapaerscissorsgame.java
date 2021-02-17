package aybike1;
import javax.swing.JOptionPane;

public class HW1 {

	public static void main(String[] args) {
		int a = (int)(Math.random() * 3);
        int c;
        String[] options = {"Rock","Paper","Scissors"};
       
        c = JOptionPane.showOptionDialog(null, "Rock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       
        for(;;) {       
            if(a==c) {
            c = JOptionPane.showOptionDialog(null, "Draw. Try Again.\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if (a==0 && c==1) {
            c = JOptionPane.showOptionDialog(null, "Rock vs. Paper. You won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if (a==0 && c==2) {
            c = JOptionPane.showOptionDialog(null, "Rock vs. Scissors. Computer won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if(a==1 && c==0) {
            c = JOptionPane.showOptionDialog(null, "Paper vs. Rock. Computer won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if(a==1 && c==2) {
            c = JOptionPane.showOptionDialog(null, "Paper vs. Scissors. You won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if(a==2 && c==0) {
            c = JOptionPane.showOptionDialog(null, "Scissors vs. Rock. You won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
       
            if(a==2 && c==1) {
            c = JOptionPane.showOptionDialog(null, "Scissors vs. Paper. Computer won!\nRock, Paper or Scissors?", "Rock, Paper, Scissors",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            }
            a = (int)(Math.random() * 3);
        }
		
	}

}
