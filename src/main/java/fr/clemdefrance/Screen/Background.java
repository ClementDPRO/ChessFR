package fr.clemdefrance.Screen;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel{
	
	private Image image;
	
	public Background(String ImagePath) {
	    java.net.URL url = getClass().getResource(ImagePath);
	   
	    if (url == null) {
	        System.err.println("ERREUR : Le fichier" + ImagePath + "est introuvable dans le classpath.");
	        throw new IllegalArgumentException("Image Introuvable : " + ImagePath);
	    } else {
	        System.out.println("Image trouvée à l'adresse : " + url.getPath());
	        this.image = new ImageIcon(url).getImage();
	    }
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
	}

	
}
