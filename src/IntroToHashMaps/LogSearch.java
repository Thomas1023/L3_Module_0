package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	int ID;
	boolean re = true;
	JPanel JP = new  JPanel();
	JFrame JF = new  JFrame();
	JButton B1 = new JButton("add entry");
	JButton B2 = new JButton("Search by ID");
	JButton B3 = new JButton("View List");
	JButton B4 = new JButton("Remove entery");
	HashMap<Integer, String> hash = new HashMap<Integer, String>();
	public static void main(String[] args) {
		LogSearch LogSearch = new LogSearch();
		
		
		LogSearch.setup();
	}
	void setup() {
		JF.add(JP);
		JP.add(B1);
		JP.add(B2);
		JP.add(B3);
		JP.add(B4);
		JF.setVisible(true);
		JF.pack();
		
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		B4.addActionListener(this);
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public void actionPerformed(ActionEvent e) {
		JButton ButtonPressed =  (JButton) e.getSource();
		if(ButtonPressed == B1) {
			String NewName = JOptionPane.showInputDialog("Enter name");
			String NewId = JOptionPane.showInputDialog("Enter id");
			
			ID=Integer.parseInt(NewId);
			hash.put(ID, NewName);
		} if(ButtonPressed == B2) {
			String OldId = JOptionPane.showInputDialog("Enter id");
			ID=Integer.parseInt(OldId);
			if(re) {
					System.out.println("hi");
				
					System.out.println(hash.get(ID));
			}else {
				System.out.println("nobody is registerd under 420");
			}
		}if(ButtonPressed == B3) {
			
		
			
//			for (int i = 0; i < 1000; i++) {
//				if(hash.get(i).equals(null)) {
//					
//				}else {
//					System.out.println("id: "+i+"  Name: "+hash.get(i));
//				}
//				
//			}
			System.out.println("id 420 is "+hash.get(420));
		}if(ButtonPressed == B4) {
			String NewId = JOptionPane.showInputDialog("Enter id");		
			ID=Integer.parseInt(NewId);
			hash.remove(ID);
			re=false;
			}
		}
		
		
	}
	

