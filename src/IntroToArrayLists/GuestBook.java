package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	JFrame J = new JFrame();
	JPanel P = new JPanel();
	JButton Book = new JButton("Book");
	JButton Look = new JButton("look");
	ArrayList<String> names = new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook GuestBook = new GuestBook();
		GuestBook.setup();
	}
	void setup() {

		
		J.setVisible(true);
		J.add(P);
		
		P.add(Book);
		P.add(Look);
		J.pack();
		
		Book.addActionListener(this);
		Look.addActionListener(this);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton ButtonPressed =  (JButton) e.getSource();
		if(ButtonPressed == Book) {
			String NewName = JOptionPane.showInputDialog("Write you name under if you would like to book");
			names.add(NewName);
		} if(ButtonPressed == Look) {
			for(int i=0;i< names.size(); i++ ) {
				System.out.println(names.get(i));
			}
		}
		
		
	}
}
