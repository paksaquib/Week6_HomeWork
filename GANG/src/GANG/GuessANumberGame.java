package GANG;

import javax.swing.JOptionPane;

public class GuessANumberGame {

	public static void main(String[] args)
	{
		int count = 1;
		int userNum;
		int CompNum;
		do
		{
			CompNum = 0 + (int)(Math.random()*10);
			userNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter Number between 0 to 10 "));
			
			if(userNum>CompNum)
			{
				JOptionPane.showMessageDialog(null, "Computer Number is " + CompNum + "\n User Number " + userNum, "Too Big", JOptionPane.PLAIN_MESSAGE);
			}
			else if (userNum<CompNum)
			{
				JOptionPane.showMessageDialog(null, "Computer Number is " + CompNum + "\n User Number " + userNum, "Too small", JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Computer Number is " + CompNum + "\n User Number " + userNum, "User Win", JOptionPane.PLAIN_MESSAGE);
			}
			count++;
					
		}while(count<4);
		JOptionPane.showMessageDialog(null, "bye!!!!!", "", JOptionPane.PLAIN_MESSAGE);
	}
}
