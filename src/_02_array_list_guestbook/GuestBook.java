package _02_array_list_guestbook;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	public static void main(String[] args) {
		
		GuestBook book = new GuestBook();
		book.run();
		
	}
	
	JFrame frame = new JFrame();
	JButton button1 = new JButton("Add Name");
	JButton button2 = new JButton("View Names");
	ArrayList<String> names = new ArrayList<String>();
	
	public void run() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.add(button1);
		frame.add(button2);
		frame.setLayout(new GridLayout());
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String names2 = "";
		
		for(int i=0;i<names.size();i++) {
			names2 += "Guest #" + (i+1) + ": " + names.get(i) + "\n";
		}
		
		return names2;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		JButton click = (JButton)arg0.getSource();
		
		if(click == button1) {
			String name = JOptionPane.showInputDialog("enter a name");
			names.add(name);
		}
		
		if(click == button2) {
			
			JOptionPane.showMessageDialog(null, this);
		}
		
	}
	
}