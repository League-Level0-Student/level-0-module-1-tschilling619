package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
String answer=	JOptionPane.showInputDialog("What is your birthday?");
	if(answer.equals("7/15/2020")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
	}
	else {
	JOptionPane.showMessageDialog(null, "Have a very, merry UnHappy Birthday");	
	}
}
}
