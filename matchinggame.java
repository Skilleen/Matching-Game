import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * 
 * @author Scott Killeen
 * @SDate, June 13 2013.
 * 
 *  This is my final project for Programming. I have designed a memory game. There is three different 
 *  Difficulties. Easy having 12 blocks, normal having 18, and hard having a turn limit. The user
 *  will be able to choose their difficulty and choose if they will like to play again.
 */
public class matchinggame extends JApplet implements ActionListener {
	JButton but[] = new JButton[30]; //Adding array for buttons.
	boolean one, two, three, four, five, six, seven,h, eight, nine, ten, eleven,
			twelve, rnd1, rnd2, rnd3, correct, crt1, crt2, crt3, crt4,
			crt5,crt6,crt7,crt8, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen;
	//Adding booleans. They are all used, one for each button and for each matching sequence.
	JLabel L1, L2, L3;//Labels
	int num1 = 0; //This is used everytime a button is hit.
	int num2 = 1;//This is to keep track on the hard mode.
	Font BFont = new Font("Plain", Font.BOLD, 20);
/**
 * This is where the GUI of the game is created. It sets out 2 grid layouts, and adds the buttons
 * and labels to the applet.  Also, a Joption pane is created for the user to select three 
 * different difficulties. 
 */
	public matchinggame() {
		JPanel s = new JPanel();//Panel for buttons
		JPanel t = new JPanel();//Panel for Labels
		t.setLayout(new GridLayout(3, 9));
		s.setLayout(new GridLayout(3, 9));
		L1 = new JLabel("The Matching Game");
		L2 = new JLabel("Welcome to");
		L3 = new JLabel("Tries:"+num2+"/10");
		L3.setVisible(false);
		L1.setFont(BFont);
		t.add(L2);
		t.add(L1);
		t.add(L3);//Adding the labels

		Object[] options = { "Easy", "Normal", "Hard" };//Creating Options for difficulties
		int choice = JOptionPane.showOptionDialog(null,
				"Easy, Normal, or Hard?", "Pick one",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION,
				null, options, options[1]);
		if (choice == 0) {
			rnd1 = true; //Easy
		} else if (choice == 1) {
			rnd2 = true; //Medium

		} else if (choice == 2) {
			rnd3 = true; //Hard
			JOptionPane.showMessageDialog(null, "Be careful, you only have 10 TOTAL tries!!");

		} else {
			JOptionPane.showMessageDialog(null, "Bye :) !");
			System.exit(0); 
		}
		if (rnd1 == true) { //If Easy
			for (int i = 0; i < 12; i++) {
				but[i] = new JButton(""); //Add 12 buttons
				s.add(but[i]);
				but[i].addActionListener(this);
			}
		}
		if (rnd2 == true) { //If normal
			for (int i = 0; i < 18; i++) {
				but[i] = new JButton(""); //Add 18 buttons
				s.add(but[i]);
				but[i].addActionListener(this);
			}
		}
		if (rnd3 == true) { //If Hard
			for (int i = 0; i < 12; i++) { //Add 12 buttons.
				but[i] = new JButton("");
				s.add(but[i]);
				but[i].addActionListener(this);
			}
		}
		add(t, BorderLayout.NORTH);
		add(s, BorderLayout.CENTER);
	}
/**
 * Here, each button is given commands. Each button has 3 different commands, one for each
 *  difficulty.(rnd1, rnd2,rnd3) When a button is clicked, it will display an image.
 */
	public void actionPerformed(ActionEvent e) {
		if(rnd1==true){ //If Easy
		if (e.getSource() == but[0]) {
			one = true; //Specific Boolean for button to be used for further commands.
			num1++;
			but[0].setIcon(new ImageIcon("Koala.jpg"));
			repaint();
		}
		if (e.getSource() == but[1]) {
			two = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[1].setIcon(new ImageIcon("Penguins.jpg"));
			repaint();
		}
		if (e.getSource() == but[2]) {
			three = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[2].setIcon(new ImageIcon("Desert.jpg"));
			repaint();
		}
		if (e.getSource() == but[3]) {
			four = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[3].setIcon(new ImageIcon("Jellyfish.jpg"));
			repaint();
		}
		if (e.getSource() == but[4]) {
			five = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[4].setIcon(new ImageIcon("Tulips.jpg"));
			repaint();
		}
		if (e.getSource() == but[5]) {
			six = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[5].setIcon(new ImageIcon("Penguins.jpg"));
			repaint();
		}
		if (e.getSource() == but[6]) {
			seven = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[6].setIcon(new ImageIcon("Koala.jpg"));
			repaint();
		}
		if (e.getSource() == but[7]) {
			eight = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[7].setIcon(new ImageIcon("Chrysanthemum.jpg"));
			repaint();
		}
		if (e.getSource() == but[8]) {
			nine = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[8].setIcon(new ImageIcon("Desert.jpg"));
			repaint();
		}
		if (e.getSource() == but[9]) {
			ten = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[9].setIcon(new ImageIcon("Chrysanthemum.jpg"));
			repaint();
		}
		if (e.getSource() == but[10]) {
			eleven = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[10].setIcon(new ImageIcon("Jellyfish.jpg"));
			repaint();
		}
		if (e.getSource() == but[11]) {
			twelve = true;//Specific Boolean for button to be used for further commands.
			num1++;
			but[11].setIcon(new ImageIcon("Tulips.jpg"));
			repaint();
		}
		}
		if (rnd2 == true) { //If Normal
			if (e.getSource() == but[0]) {
				one = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[0].setIcon(new ImageIcon("Frodo.jpg"));
			}
			if (e.getSource() == but[1]) {
				two = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[1].setIcon(new ImageIcon("Gandalf.jpg"));

			}
			if (e.getSource() == but[2]) {
				three = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[2].setIcon(new ImageIcon("Gandalf.jpg"));
				repaint();
			}
			if (e.getSource() == but[3]) {
				four = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[3].setIcon(new ImageIcon("Legolas.jpg"));
				repaint();
			}
			if (e.getSource() == but[4]) {
				five = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[4].setIcon(new ImageIcon("gimli.jpg"));
				repaint();
			}
			if (e.getSource() == but[5]) {
				six = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[5].setIcon(new ImageIcon("Gollum.jpg"));
				repaint();
			}
			if (e.getSource() == but[6]) {
				seven = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[6].setIcon(new ImageIcon("Sarumon.jpg"));
				repaint();
			}
			if (e.getSource() == but[7]) {
				eight = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[7].setIcon(new ImageIcon("Sam.jpg"));
				repaint();
			}
			if (e.getSource() == but[8]) {
				nine = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[8].setIcon(new ImageIcon("eye.jpg"));
				repaint();
			}
			if (e.getSource() == but[9]) {
				ten = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[9].setIcon(new ImageIcon("Sarumon.jpg"));
				repaint();
			}
			if (e.getSource() == but[10]) {
				eleven = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[10].setIcon(new ImageIcon("theoden22.jpg"));
				repaint();
			}
			if (e.getSource() == but[11]) {
				twelve = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[11].setIcon(new ImageIcon("eye.jpg"));
				repaint();
			}
			if (e.getSource() == but[12]) {
				thirteen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[12].setIcon(new ImageIcon("gimli.jpg"));
			}
			if (e.getSource() == but[13]) {
				fourteen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[13].setIcon(new ImageIcon("Sam.jpg"));
			}
			if (e.getSource() == but[14]) {
				fifteen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[14].setIcon(new ImageIcon("Gollum.jpg"));
			}
			if (e.getSource() == but[15]) {
				sixteen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[15].setIcon(new ImageIcon("Frodo.jpg"));
			}
			if (e.getSource() == but[16]) {
				seventeen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[16].setIcon(new ImageIcon("theoden22.jpg"));
			}
			if (e.getSource() == but[17]) {
				eighteen = true;//Specific Boolean for button to be used for further commands.
				num1++;
				repaint();
				but[17].setIcon(new ImageIcon("Legolas.jpg"));
			}
		}
		if(rnd3==true){ //If Hard
			if (e.getSource() == but[0]) {
				one = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[0].setIcon(new ImageIcon("Tulips.jpg"));
			}
			if (e.getSource() == but[1]) {
				two = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[1].setIcon(new ImageIcon("Jellyfish.jpg"));

			}
			if (e.getSource() == but[2]) {
				three = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[2].setIcon(new ImageIcon("Desert.jpg"));
				repaint();
			}
			if (e.getSource() == but[3]) {
				four = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[3].setIcon(new ImageIcon("Koala.jpg"));
				repaint();
			}
			if (e.getSource() == but[4]) {
				five = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[4].setIcon(new ImageIcon("Desert.jpg"));
				repaint();
			}
			if (e.getSource() == but[5]) {
				six = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[5].setIcon(new ImageIcon("Chrysanthemum.jpg"));
				repaint();
			}
			if (e.getSource() == but[6]) {
				seven = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[6].setIcon(new ImageIcon("Chrysanthemum.jpg"));
				repaint();
			}
			if (e.getSource() == but[7]) {
				eight = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[7].setIcon(new ImageIcon("Penguins.jpg"));
				repaint();
			}
			if (e.getSource() == but[8]) {
				nine = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[8].setIcon(new ImageIcon("Jellyfish.jpg"));
				repaint();
			}
			if (e.getSource() == but[9]) {
				ten = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[9].setIcon(new ImageIcon("Penguins.jpg"));
				repaint();
			}
			if (e.getSource() == but[10]) {
				eleven = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[10].setIcon(new ImageIcon("Tulips.jpg"));
				repaint();
			}
			if (e.getSource() == but[11]) {
				twelve = true;//Specific Boolean for button to be used for further commands.
				num1++;
				but[11].setIcon(new ImageIcon("Koala.jpg"));
				repaint();
			}
			}
	}
/**
 * The paint method is used to handle the mechanics of the game. Again, it has 3 sets of code,
 * one for rnd1, rnd2, rnd3. Anytime 2 buttons have been pressed, it will hide all the blocks again
 * unless they are matching. This is done using booleans.
 */
	public void paint(Graphics g) {
		super.paint(g);
		if (rnd1 == true) {//If Easy
			if (num1 == 2) { //If two buttons have been pressed.
				for (int i = 0; i < 12; i++) {
					but[i].setIcon(null); //Flip them all over.
					try {
						Thread.currentThread().sleep(10); //Creates a delay, looks cleaner this way.
					} catch (Exception ie) {
					}

				}

				if (one == true && seven == true) { //If they match.
					but[0].setIcon(new ImageIcon("Koala.jpg"));
					but[6].setIcon(new ImageIcon("Koala.jpg"));
					correct = true;

				}
				if (two == true && six == true) {//If they match.
					but[1].setIcon(new ImageIcon("Penguins.jpg"));
					but[5].setIcon(new ImageIcon("Penguins.jpg"));
					crt1 = true;
				}
				if (five == true && twelve == true) {//If they match.
					but[11].setIcon(new ImageIcon("Tulips.jpg"));
					but[4].setIcon(new ImageIcon("Tulips.jpg"));
					crt2 = true;

				}
				if (four == true && eleven == true) {//If they match.
					but[3].setIcon(new ImageIcon("Jellyfish.jpg"));
					but[10].setIcon(new ImageIcon("Jellyfish.jpg"));
					crt3 = true;
				}
				if (eight == true && ten == true) {//If they match.
					but[9].setIcon(new ImageIcon("Chrysanthemum.jpg"));
					but[7].setIcon(new ImageIcon("Chrysanthemum.jpg"));
					crt4 = true;

				}
				if (three == true && nine == true) {//If they match.
					but[2].setIcon(new ImageIcon("Desert.jpg"));
					but[8].setIcon(new ImageIcon("Desert.jpg"));
					crt5 = true;
				}
				if (!correct) {//If they don't match, then keep the booleans false.
					one = false;
					seven = false;
				}
				if (!crt1) {//If they don't match, then keep the booleans false.
					two = false;
					six = false;
				}
				if (!crt2) {//If they don't match, then keep the booleans false.
					five = false;
					twelve = false;
				}
				if (!crt3) {//If they don't match, then keep the booleans false.
					four = false;
					eleven = false;
				}
				if (!crt4) {//If they don't match, then keep the booleans false.
					eight = false;
					ten = false;
				}
				if (!crt5) {//If they don't match, then keep the booleans false.
					three = false;
					nine = false;
				}
				num1 = 0; //Reset count.
				repaint();
				if (correct == true && crt1 == true && crt2 == true  //If the game is complete.
						&& crt3 == true && crt4 == true && crt5 == true) {
					Object[] options1 = { "Play again", "Quit" };
					int choice1 = JOptionPane.showOptionDialog(null,
							"Play again, Quit", "Pick one",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.DEFAULT_OPTION, null, options1,
							options1[1]);
					repaint();
					if (choice1 == 0) {
						for (int i = 0; i < 12; i++) {
							but[i].setIcon(null); //Resets the game.
						}
						correct = false;
						crt1 = false;
						crt2 = false;
						crt3 = false;
						crt4 = false;
						crt5 = false;
						one = false;
						two = false;
						three = false;
						four = false;
						five = false;
						six = false;
						seven = false;
						eight = false;
						nine = false;
						ten = false;
						eleven = false;
						twelve = false;
					} else if (choice1 == 1) {
						JOptionPane.showMessageDialog(null,
								"Thanks for Playing!");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(null,
								"Thanks for Playing!");
						System.exit(0);
					}

				}
			}
		}

		if (rnd2 == true) { //Normal
			//Works the same way as easy but with additional buttons.
				if (num1 == 2) {
					for (int i = 0; i < 18; i++) {
						but[i].setIcon(null);
						try {
							Thread.currentThread().sleep(10);
						} catch (Exception ie) {
						}

					}

					if (one == true && sixteen == true) {
						but[0].setIcon(new ImageIcon("Frodo.jpg"));
						but[15].setIcon(new ImageIcon("Frodo.jpg"));
						correct = true;

					}
					if (two == true && three == true) {
						but[1].setIcon(new ImageIcon("Gandalf.jpg"));
						but[2].setIcon(new ImageIcon("Gandalf.jpg"));
						crt1 = true;
					}
					if (four == true && eighteen == true) {
						but[3].setIcon(new ImageIcon("Legolas.jpg"));
						but[17].setIcon(new ImageIcon("Legolas.jpg"));
						crt2 = true;

					}
					if (five == true && thirteen == true) {
						but[4].setIcon(new ImageIcon("gimli.jpg"));
						but[12].setIcon(new ImageIcon("gimli.jpg"));
						crt3 = true;
					}
					if (six == true && fifteen == true) {
						but[5].setIcon(new ImageIcon("Gollum.jpg"));
						but[14].setIcon(new ImageIcon("Gollum.jpg"));
						crt4 = true;
					}
					if (seven == true && ten == true) {
						but[6].setIcon(new ImageIcon("Sarumon.jpg"));
						but[9].setIcon(new ImageIcon("Sarumon.jpg"));
						crt5 = true;
					}
					if (eight == true && fourteen == true) {
						but[7].setIcon(new ImageIcon("Sam.jpg"));
						but[13].setIcon(new ImageIcon("Sam.jpg"));
						crt6 = true;
					}
					if (nine == true && twelve == true) {
						but[8].setIcon(new ImageIcon("eye.jpg"));
						but[11].setIcon(new ImageIcon("eye.jpg"));
						crt7 = true;
					}
					if (eleven == true && seventeen == true) {
						but[10].setIcon(new ImageIcon("theoden22.jpg"));
						but[16].setIcon(new ImageIcon("theoden22.jpg"));
						crt8 = true;
					}
					if (!correct) {
						one = false;
						sixteen = false;
					}
					if (!crt1) {
						two = false;
						three = false;
					}
					if (!crt2) {
						four = false;
						eighteen = false;
					}
					if (!crt3) {
						five = false;
						thirteen = false;
					}
					if (!crt4) {
						six = false;
						fifteen = false;
					}
					if (!crt5) {
						seven = false;
						ten = false;
					}
					if (!crt6) {
						eight = false;
						fourteen = false;
					}
					if (!crt7) {
						nine = false;
						twelve = false;
					}
					if (!crt8) {
						eleven = false;
						seventeen = false;
					}
					num1 = 0;
					repaint();
					//If complete
					if (correct == true && crt1 == true && crt2 == true
							&& crt3 == true && crt4 == true && crt5 == true && crt6==true && crt7==true && crt8==true) {
						Object[] options1 = { "Play again", "Quit" };
						int choice1 = JOptionPane.showOptionDialog(null,
								"Play again, Quit", "Pick one",
								JOptionPane.YES_NO_CANCEL_OPTION,
								JOptionPane.DEFAULT_OPTION, null, options1,
								options1[1]);
						repaint();
						if (choice1 == 0) {
							for (int i = 0; i < 18; i++) {
								but[i].setIcon(null);//reset game.
							}
							correct = false;
							crt1 = false;
							crt2 = false;
							crt3 = false;
							crt4 = false;
							crt5 = false;
							crt6 = false;
							crt7 = false;
							crt8 = false;
							one = false;
							two = false;
							three = false;
							four = false;
							five = false;
							six = false;
							seven = false;
							eight = false;
							nine = false;
							ten = false;
							eleven = false;
							twelve = false;
							thirteen=false;
							fifteen=false;
							sixteen=false;
							seventeen=false;
							fourteen=false;
							eighteen=false;
						} else if (choice1 == 1) {
							JOptionPane.showMessageDialog(null,
									"Thanks for Playing!");
							System.exit(0);
						} else {
							JOptionPane.showMessageDialog(null,
									"Thanks for Playing!");
							System.exit(0);
						}

					}
		}
		}	
		if (rnd3 == true) {//Hard
			//Works the same way again, this time with num2 to count their attempts.
			L3.setVisible(true);
			if (num1 == 2) {
				for (int i = 0; i < 12; i++) {
					but[i].setIcon(null);
					L3.setText("Tries:"+num2+"/10");
					try {
						Thread.currentThread().sleep(10);
					} catch (Exception ie) {
					}

				}
				num2++; //adds one to the count.
				if (one == true && eleven == true) {
					but[0].setIcon(new ImageIcon("Tulips.jpg"));
					but[10].setIcon(new ImageIcon("Tulips.jpg"));
					correct = true;
				}
				if (two == true && nine == true) {
					but[1].setIcon(new ImageIcon("Jellyfish.jpg"));
					but[8].setIcon(new ImageIcon("Jellyfish.jpg"));
					crt1 = true;
				}
				if (five == true && three == true) {
					but[4].setIcon(new ImageIcon("Desert.jpg"));
					but[2].setIcon(new ImageIcon("Desert.jpg"));
					crt2 = true;

				}
				if (four == true && twelve == true) {
					but[3].setIcon(new ImageIcon("Koala.jpg"));
					but[11].setIcon(new ImageIcon("Koala.jpg"));
					crt3 = true;
				
				}
				if (six == true && seven == true) {
					but[5].setIcon(new ImageIcon("Chrysanthemum.jpg"));
					but[6].setIcon(new ImageIcon("Chrysanthemum.jpg"));
					crt4 = true;
				}
				if (eight == true && ten == true) {
					but[7].setIcon(new ImageIcon("Penguins.jpg"));
					but[9].setIcon(new ImageIcon("Penguins.jpg"));
					crt5 = true;
				
				}
				if (!correct) {
					one = false;
					eleven = false;
				}
				if (!crt1) {
					two = false;
					nine = false;
				}
				if (!crt2) {
					five = false;
					three = false;
				}
				if (!crt3) {
					four = false;
					twelve = false;

				}
				if (!crt4) {
					six = false;
					seven = false;
				}
				if (!crt5) {
					eight = false;
					ten = false;
				}
				num1 = 0;
				repaint();
				//If complete
				if (correct == true && crt1 == true && crt2 == true
						&& crt3 == true && crt4 == true && crt5 == true) {
					Object[] options1 = { "Play again", "Quit" };
					int choice1 = JOptionPane.showOptionDialog(null,
							"Play again, Quit", "Pick one",
							JOptionPane.YES_NO_CANCEL_OPTION,
							JOptionPane.DEFAULT_OPTION, null, options1,
							options1[1]);
					repaint();
					if (choice1 == 0) {
						for (int i = 0; i < 12; i++) {
							but[i].setIcon(null); //Reset data.
						}
						correct = false;
						crt1 = false;
						crt2 = false;
						crt3 = false;
						crt4 = false;
						crt5 = false;
						one = false;
						two = false;
						three = false;
						four = false;
						five = false;
						six = false;
						seven = false;
						eight = false;
						nine = false;
						ten = false;
						eleven = false;
						twelve = false;
						num2=0;
						num1=0;
						L3.setText("Tries:"+"0"+"/10");
					} else if (choice1 == 1) {
						JOptionPane.showMessageDialog(null,
								"Thanks for Playing!");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(null,
								"Thanks for Playing!");
						System.exit(0);
					}
				}
			}
			//If the max turns is reached.
			if(num2==11){ 
				JOptionPane.showMessageDialog(null,
						"You lose! Take time to reflect on your failure!!");
				System.exit(0);
			}	
		}
				repaint();	
	}
/**
 * Adding background.
 */
	public void init() {
		setSize(1000, 1000);
	}

}