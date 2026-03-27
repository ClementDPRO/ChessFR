package fr.clemdefrance;

import javax.swing.JOptionPane;

import fr.clemdefrance.Screen.Frame;

public class Main {
	
	private static void launch() {
		Frame frame = new Frame("Chess");
	}
	
	private static Boolean verify() {
		try {
			Class.forName("javax.swing.JFrame");
			Class.forName("javax.swing.JPanel");
			Class.forName("javafx.application.Application");
		} catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Error: Class Or lib not found: please contact an administrator! Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		if(verify()) {
			launch();
		}
	}

}
