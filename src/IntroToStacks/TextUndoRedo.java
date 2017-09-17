package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TextUndoRedo implements ActionListener, KeyListener{
	JPanel jp = new JPanel();
	JFrame jf = new JFrame();
	JLabel text = new JLabel();
	JButton fontU = new JButton("A");
	JButton fontD = new JButton("a");
	char newLetter;
	String texts;
	
	public static void main(String[] args) {
		TextUndoRedo TextUndoRedo = new TextUndoRedo();
		TextUndoRedo.setup();
		
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */

	public void setup() {
		jf.add(jp);
		jp.add(text);
		jp.add(fontU);
		jp.add(fontD);
		jf.setVisible(true);
		jf.setTitle("Text editor 5000");
		jf.setSize(1000, 1450);
		
		jf.addKeyListener(this);
		jp.addKeyListener(this);
		fontD.addActionListener(this);
		fontU.addActionListener(this);
		jp.requestFocus();
	}
	
	public void update() {
		jp.repaint();
		jf.repaint();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton ButtonPressed =  (JButton) e.getSource();
		if(ButtonPressed == fontU) {
			System.out.println("Bigger");
			jp.requestFocus();
		} 
		if(ButtonPressed == fontD) {
			System.out.println("smaller");
			jp.requestFocus();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char newLetter = e.getKeyChar();
		System.out.println(newLetter);
		texts = texts + newLetter;
		text.setText(texts);
	}
	
}
