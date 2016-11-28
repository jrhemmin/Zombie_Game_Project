package com.zombie.game;
import javax.swing.*;
import java.awt.event.*;

public class EndGame extends JFrame
{
	public static void main(String[] args)
	{
		new EndGame();
	}
	
	private JButton buttonYes; 
	private JButton buttonNo;  
	
	public EndGame()
	{
		this.setSize(325,100);
		this.setLocation(500,300);	//sets window location on the screen
		this.setTitle("Would you like to play again?");		//creates the window to ask if you'd like to play again
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		
		buttonYes = new JButton("Yes"); //new button yes
		buttonYes.addActionListener(e -> buttonYesClick() );
		panel1.add(buttonYes); //adds button
		
		buttonNo = new JButton("No"); //new button no
		buttonNo.addActionListener(e -> buttonNoClick() );
		panel1.add(buttonNo); //adds button
		
		this.add(panel1);
		this.setVisible(true);
	}
	public void buttonNoClick()	//if no is clicked, end game
	{
		JOptionPane.showMessageDialog(
				EndGame.this,				
				"Thanks for playing",
				getTitle(), JOptionPane.INFORMATION_MESSAGE);
				int clickCount = 0;
				clickCount++;		
				if(clickCount > 0)  //if no is clicked, after message is shown, will exit the window
				{
					System.exit(0);
				}
	}
	public void buttonYesClick()	//if yes is clicked, close window and restart score
	{
		int clickCount = 0;		
		clickCount++;			
		if(clickCount > 0)
		{
			System.exit(0);
		}
	}
}
