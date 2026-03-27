package fr.clemdefrance.Screen;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import fr.clemdefrance.piece.Pions;
import fr.clemdefrance.piece.Plate;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	private static Pions pion1W;
	private static Pions pion2W;
	private static Pions pion3W;
	private static Pions pion4W;
	private static Pions pion5W;
	private static Pions pion6W;
	private static Pions pion7W;
	private static Pions pion8W;
	
	private static Pions pion1B; 
	private static Pions pion2B; 
	private static Pions pion3B;  
	private static Pions pion4B; 
	private static Pions pion5B; 
	private static Pions pion6B;
	private static Pions pion7B;
	private static Pions pion8B;
	
	private static Pions tours1W;
	private static Pions tours1B;
	private static Pions tours2W;
	private static Pions tours2B;
	
	private static Pions cav1W;
	private static Pions cav1B;
	private static Pions cav2W;
	private static Pions cav2B;
	
	private static Pions fou1W;
	private static Pions fou1B;
	private static Pions fou2W;
	private static Pions fou2B;
	
	private static Pions queenB;
	private static Pions queenW;
	
	private static Pions kingW;
	private static Pions kingB;
	
	public Frame(String name) {
		Background bg = new Background("/assets/BackGround.png");
		bg.setLayout(null);
		
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		
		int screenW = (int) screen.getWidth();
		int screenH = (int) screen.getHeight();
		
		this.setTitle(name);
		this.setSize(screenW / 2, screenH - 20);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(bg);
		organize();
		this.setIconImage(new ImageIcon(getClass().getResource("/Black/cavaliernoir.png")).getImage());
		this.setVisible(true);
		
	}
	
	
	
	public void organize() {
	    Plate plate = new Plate();
	    Random rand = new Random();
	    int resultat = rand.nextInt(2);

	    if(resultat == 0) {
	    	pion1W = new Pions("/White/pionblanc.png", 0, "A", "2", plate, "Pion 1 White");
	    	pion2W = new Pions("/White/pionblanc.png", 0, "B", "2", plate, "Pion 2 White");
	    	pion3W = new Pions("/White/pionblanc.png", 0, "C", "2", plate, "Pion 3 White");
	    	pion4W = new Pions("/White/pionblanc.png", 0, "D", "2", plate, "Pion 4 White");
	    	pion5W = new Pions("/White/pionblanc.png", 0, "E", "2", plate, "Pion 5 White");
	    	pion6W = new Pions("/White/pionblanc.png", 0, "F", "2", plate, "Pion 6 White");
	    	pion7W = new Pions("/White/pionblanc.png", 0, "G", "2", plate, "Pion 7 White");
	    	pion8W = new Pions("/White/pionblanc.png", 0, "H", "2", plate, "Pion 8 White");
	    	tours1W = new Pions("/White/tourblanc.png", 0, "A", "1", plate, "Tour 1 White");
	    	tours2W = new Pions("/White/tourblanc.png", 0, "H", "1", plate, "Tour 2 White");
	    	cav1W = new Pions("/White/cavalierblanc.png", 0, "B", "1", plate, "Cavalier 1 White");
	    	cav2W = new Pions("/White/cavalierblanc.png", 0, "G", "1", plate, "Cavalier 2 White");
	    	fou1W = new Pions("/White/foublanc.png", 0, "C", "1", plate, "Fou 1 White");
	    	fou2W = new Pions("/White/foublanc.png", 0, "F", "1", plate, "Fou 2 White");
	    	queenW = new Pions("/White/reineblanc.png", 0, "D", "1", plate, "Queen White");
	    	kingW = new Pions("/White/roiblanc.png", 0, "E", "1", plate, "king Black");
	    	

	    	pion1B = new Pions("/Black/pionnoir.png", 0, "A", "7", plate, "Pion 1 Black");
	    	pion2B = new Pions("/Black/pionnoir.png", 0, "B", "7", plate, "Pion 2 Black");
	    	pion3B = new Pions("/Black/pionnoir.png", 0, "C", "7", plate, "Pion 3 Black");
	    	pion4B = new Pions("/Black/pionnoir.png", 0, "D", "7", plate, "Pion 4 Black");
	    	pion5B = new Pions("/Black/pionnoir.png", 0, "E", "7", plate, "Pion 5 Black");
	    	pion6B = new Pions("/Black/pionnoir.png", 0, "F", "7", plate, "Pion 6 Black");
	    	pion7B = new Pions("/Black/pionnoir.png", 0, "G", "7", plate, "Pion 7 Black");
	    	pion8B = new Pions("/Black/pionnoir.png", 0, "H", "7", plate, "Pion 8 Black");
	    	tours1B = new Pions("/Black/tournoir.png", 0, "A", "8", plate, "Tour 1 Black");
	    	tours2B = new Pions("/Black/tournoir.png", 0, "H", "8", plate, "Tour 2 Black");
	    	cav1B = new Pions("/Black/cavaliernoir.png", 0, "B", "8", plate, "Cavalier 1 Black");
	    	cav2B = new Pions("/Black/cavaliernoir.png", 0, "G", "8", plate, "Cavalier 2 Black");
	    	fou1B = new Pions("/Black/founoir.png", 0, "C", "8", plate, "Fou 1 Black");
	    	fou2B = new Pions("/Black/founoir.png", 0, "F", "8", plate, "Fou 2 Black");
	    	queenB = new Pions("/Black/reinenoir.png", 0, "D", "8", plate, "Queen Black");
	    	kingB = new Pions("/Black/roinoir.png", 0, "E", "8", plate, "king Black");





	    } else {
	    	pion1W = new Pions("/White/pionblanc.png", 0, "A", "7", plate, "Pion 1 White");
	    	pion2W = new Pions("/White/pionblanc.png", 0, "B", "7", plate, "Pion 2 White");
	    	pion3W = new Pions("/White/pionblanc.png", 0, "C", "7", plate, "Pion 3 White");
	    	pion4W = new Pions("/White/pionblanc.png", 0, "D", "7", plate, "Pion 4 White");
	    	pion5W = new Pions("/White/pionblanc.png", 0, "E", "7", plate, "Pion 5 White");
	    	pion6W = new Pions("/White/pionblanc.png", 0, "F", "7", plate, "Pion 6 White");
	    	pion7W = new Pions("/White/pionblanc.png", 0, "G", "7", plate, "Pion 7 White");
	    	pion8W = new Pions("/White/pionblanc.png", 0, "H", "7", plate, "Pion 8 White");
	    	tours1W = new Pions("/White/tourblanc.png", 0, "A", "8", plate, "Tour 1 White");
	    	tours2W = new Pions("/White/tourblanc.png", 0, "H", "8", plate, "Tour 2 White");
	    	cav1W = new Pions("/White/cavalierblanc.png", 0, "B", "8", plate, "Cavalier 1 White");
	    	cav2W = new Pions("/White/cavalierblanc.png", 0, "G", "8", plate, "Cavalier 2 White");
	    	fou1W = new Pions("/White/foublanc.png", 0, "C", "8", plate, "Fou 1 White");
	    	fou2W = new Pions("/White/foublanc.png", 0, "F", "8", plate, "Fou 2 White");
	    	queenW = new Pions("/White/reineblanc.png", 0, "E", "8", plate, "Queen White");
	    	kingW = new Pions("/White/roiblanc.png", 0, "E", "8", plate, "king Black");

	    	pion1B = new Pions("/Black/pionnoir.png", 0, "A", "2", plate, "Pion 1 Black");
	    	pion2B = new Pions("/Black/pionnoir.png", 0, "B", "2", plate, "Pion 2 Black");
	    	pion3B = new Pions("/Black/pionnoir.png", 0, "C", "2", plate, "Pion 3 Black");
	    	pion4B = new Pions("/Black/pionnoir.png", 0, "D", "2", plate, "Pion 4 Black");
	    	pion5B = new Pions("/Black/pionnoir.png", 0, "E", "2", plate, "Pion 5 Black");
	    	pion6B = new Pions("/Black/pionnoir.png", 0, "F", "2", plate, "Pion 6 Black");
	    	pion7B = new Pions("/Black/pionnoir.png", 0, "G", "2", plate, "Pion 7 Black");
	    	pion8B = new Pions("/Black/pionnoir.png", 0, "H", "2", plate, "Pion 8 Black");
	    	tours1B = new Pions("/Black/tournoir.png", 0, "A", "1", plate, "Tour 1 Black");
	    	tours2B = new Pions("/Black/tournoir.png", 0, "H", "1", plate, "Tour 2 Black");
	    	cav1B = new Pions("/Black/cavaliernoir.png", 0, "B", "1", plate, "Cavalier 1 Black");
	    	cav2B = new Pions("/Black/cavaliernoir.png", 0, "G", "1", plate, "Cavalier 2 Black");
	    	fou1B = new Pions("/Black/founoir.png", 0, "C", "1", plate, "Fou 1 Black");
	    	fou2B = new Pions("/Black/founoir.png", 0, "F", "1", plate, "Fou 2 Black");
	    	queenB = new Pions("/Black/reinenoir.png", 0, "D", "1", plate, "Queen Black");
	    	kingB = new Pions("/Black/roinoir.png", 0, "E", "1", plate, "king Black");


	        
	    }

	    Pions[] blancs = { pion1W, pion2W, pion3W, pion4W, pion5W, pion6W, pion7W, pion8W, tours1W, tours2W, cav1W, cav2W, fou1W, fou2W, queenW, kingW};
	    Pions[] noirs  = { pion1B, pion2B, pion3B, pion4B, pion5B, pion6B, pion7B, pion8B, tours1B, tours2B, cav2B, cav1B, fou1B, fou2B, queenB, kingB};

	    Background bg = (Background) this.getContentPane();

	    for (Pions p : blancs) {
	        int posX = plate.co.get(p.getLetter());
	        int posY = plate.co.get(p.getNumber());

	        p.setBounds(posX, posY, p.getTaille(), p.getTaille());
	        System.out.println("[Log] add White piece! name: " + p.getName() + " Loc X : " + posX + " Loc Y: " + posY + " Width: " + p.getTaille());
	        bg.add(p);
	    }

	    for (Pions p : noirs) {
	        int posX = plate.co.get(p.getLetter());
	        int posY = plate.co.get(p.getNumber());
	        
	        System.out.println("[Log] add White piece! name: " + p.getName() + " | Loc X: " + posX + " | Loc Y: " + posY + " | Width: " + p.getTaille());


	        p.setBounds(posX, posY, p.getTaille(), p.getTaille());
	        bg.add(p);
	    }


	    bg.repaint();
	}

 }
