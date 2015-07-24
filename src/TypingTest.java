


import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Robot;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;




public class TypingTest extends JFrame

{ 


	static Engine obj = new Engine();
	static String ip[] = {" "};
	static String userInput;
	static Scanner kbReader = new Scanner (System.in);
	static String ip2;
	static boolean print = false;

	JPanel panelOne = new JPanel();
	JPanel panelTwo = new JPanel();
	JPanel panelThree = new JPanel();

	JButton startBut = new JButton("Start Typing Test");
	JButton howToBut = new JButton("Instructions");
	JButton scoresBut = new JButton("Past Scores");


	JLabel labelOne = new JLabel("<html><br>Welcome to Jack Gola's Typing Challenge 2015!<html>");



	public static void main (String args[]) 
	{
		new TypingTest();
		System.out.println("Welcome to Jack Gola's Typing Challenge 2015!\n"
				+ "This test will be 60 seconds long and will let you know\n"
				+ "your approximate words per minute (WPM).\n\n"
				+ "1 - Start Typing Test\n"
				+ "2 - Instructions\n"
				+ "3 - Past Scores\n");

		Scanner choiceReader = new Scanner (System.in);
		int choice = choiceReader.nextInt();



		switch(choice)
		{
		case 1:
			System.out.println("\nGenerating random word cluster...\n");


			Timer Ready = new Timer();
			Timer Set = new Timer();
			Timer Go = new Timer();
			Timer length = new Timer();

			obj.generateRandomArray(); 

			Ready.schedule(new TimerTask() 
			{
				@Override
				public void run() 
				{                
					System.out.println("\n\nReady");
				}
			}, 1000);	//1 second

			Set.schedule(new TimerTask() 
			{
				@Override
				public void run() 
				{                
					System.out.println("Set");
				}
			}, 2000);	//2 seconds
			Go.schedule(new TimerTask() 
			{
				@Override
				public void run() 
				{                


					System.out.println("Go!");
					print = true;
					if (print == true);{
						userInput = kbReader.nextLine();
						userInput.split("\\s");
						//kbReader.close(); 
					}	


				}
			}, 3000);

			//3 seconds
			//Arrays.toString(ip);
			length.schedule(new TimerTask() 
			{
				@Override
				public final void run() 
				{    



					if (userInput == null)
					{
						Robot r;
						try {
							r = new Robot();
							r.keyPress(KeyEvent.VK_ENTER);
							r.keyRelease(KeyEvent.VK_ENTER);
							System.out.println("\nTime's Up!\n");
							//System.out.println(userInput);

						} catch (AWTException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();

						}
						//userInput.toString();
						System.out.println(userInput);
					}


				}
			}, 5000);  //10 seconds, should be 60 (60,000)

			break;
		default:   
			System.out.println("Selection wasn't vaild.  Restart program and try again.");
		}


	}
	public TypingTest()
	{
		super("Jack Gola's Typing Challenge 2015");
		JFrame guiFrame = new JFrame();

		guiFrame.setSize(317,427);
		guiFrame.setResizable(false);

		guiFrame.setTitle("Java Typing Test");
		guiFrame.getContentPane().setLayout(new BorderLayout());

		//add(panelOne);
		guiFrame.getContentPane().add(panelOne);
		panelOne.setLayout(null);
		labelOne.setFont(new Font("Tahoma", Font.PLAIN, 11));
		labelOne.setHorizontalAlignment(SwingConstants.RIGHT);
		labelOne.setBounds(38, 0, 227, 49);
		//guiFrame.add(panelTwo,BorderLayout.CENTER);


		panelOne.add(labelOne);
		startBut.setBounds(89, 286, 115, 23);
		panelOne.add(startBut);
		howToBut.setBounds(89, 320, 115, 23);
		panelOne.add(howToBut);
		scoresBut.setBounds(89, 354, 115, 23);
		panelOne.add(scoresBut);

		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setForeground(SystemColor.textHighlight);
		horizontalBox.setBackground(SystemColor.textHighlight);
		horizontalBox.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		horizontalBox.setBounds(31, 60, 247, 209);
		panelOne.add(horizontalBox);

		JEditorPane dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft = new JEditorPane();
		dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft.setFont(new Font("Consolas", Font.PLAIN, 5));
		dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft.setText("             ____________________________________________________\r\n            /                                                    \\\r\n           |    _____________________________________________     |\r\n           |   |                                             |    |\r\n           |   |  C:\\> _                                     |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |                                             |    |\r\n           |   |_____________________________________________|    |\r\n           |                                                      |\r\n            \\_____________________________________________________/\r\n                   \\_______________________________________/\r\n                _______________________________________________\r\n             _-'    .-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.  --- `-_\r\n          _-'.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.--.  .-.-.`-_\r\n       _-'.-.-.-. .---.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-`__`. .-.-.-.`-_\r\n    _-'.-.-.-.-. .-----.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-----. .-.-.-.-.`-_\r\n _-'.-.-.-.-.-. .---.-. .-----------------------------. .-.---. .---.-.-.-.`-_\r\n:-----------------------------------------------------------------------------:\r\n`---._.-----------------------------------------------------------------._.---'\r\n\r\n\r\n\r\n\r\n\r\n");
		dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft.setBackground(SystemColor.info);
		dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft.setBounds(31, 60, 247, 209);
		panelOne.add(dtrpnuodbbouuodbbbbbbbbbbbbbbbbrpftlimbbbbbbbbbbbbbbbrpft);

		startBut.addActionListener(new ActionListener()     //action listener for main menu button
				{
			@Override
			public void actionPerformed(ActionEvent event)
			{        
				panelOne.setVisible(false);

				//if(mainMenu.isVisible())
				//{
					//viewBut.setVisible(false);
				//}

				//Hour.setVisible(!Hour.isVisible());      //hours
				//comboLbl.setVisible(!comboLbl.isVisible());  
				//Minute.setVisible(!Minute.isVisible());     //minutes
				//comboLbl2.setVisible(!comboLbl2.isVisible());
				//TOD.setVisible(!TOD.isVisible());
				//comboLbl3.setVisible(!comboLbl3.isVisible());

//				setAlarmBut.setVisible(false);
//				sleepBut.setVisible(false);
//				friendsBut.setVisible(false);
				//if (setAlarmBut.isVisible())

			}
				});


		guiFrame.setVisible(true);

	}
}