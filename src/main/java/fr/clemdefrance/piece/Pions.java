package fr.clemdefrance.piece;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pions extends JPanel implements MouseListener {
	
	private Image image;
    private int type;
    private boolean isClick = false; 
    private int taille = 100;
    private String letter;
    private String number;
    private Plate plate; 

    public Pions(String ImagePath, int type, String letter, String number, Plate plate, String name) {
        this.type = type;
        this.letter = letter;
        this.number = number;
        this.plate = plate; 
        this.setName(name);

        this.addMouseListener(this);
        this.setOpaque(false);

        java.net.URL url = getClass().getResource(ImagePath);
        if (url == null) {
            throw new IllegalArgumentException("Image Introuvable : " + ImagePath);
        } else {
            this.image = new ImageIcon(url).getImage();
        }
        
        new Thread(() -> {
            while(true) {
                taille = isClick ? 124 : 100;
                
                setSize(taille, taille);
                setPreferredSize(new Dimension(taille, taille));
                setLayout(null);
                revalidate();
                repaint();
                try { Thread.sleep(16); } catch(InterruptedException e) { break; }
            }
        }).start();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, taille, taille, this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        isClick = !isClick; 
        System.out.println("Clic sur " + letter + number);
    }

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
	public int getTaille() {
		return taille;
	}
	
	
	public String getLetter() {
	    return letter;
	}

	public String getNumber() {
	    return number;
	}


}
