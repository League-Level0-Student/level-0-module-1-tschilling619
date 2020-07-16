package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
 int playerscore=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle=JOptionPane.showInputDialog("You live in one story house that is all white,\n what color are the stairs");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(riddle.equals("You live in a one story house, what stairs?")) {
	JOptionPane.showMessageDialog(null, "Correct");
	playerscore++;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "The answer is,\n since you live in a one story house there are no stairs ");
}
		// 6. Add some more riddles
riddle= JOptionPane.showInputDialog("What runs around the whole yard without moving?");
if(riddle.equals("The fence")) {
	JOptionPane.showMessageDialog(null, "Correct");
	playerscore++;
}
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "The answer is, the fence");
}
riddle=JOptionPane.showInputDialog("Why is Europe like a frying pan?");
if(riddle.equals("Because it has Greece at the bottom")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Wrong");
	JOptionPane.showMessageDialog(null, "The answer is, because it has Greece at the bottom");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is "+playerscore);
	}
}

