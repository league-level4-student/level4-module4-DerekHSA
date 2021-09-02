package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph {
	BufferedImage image;
	void loadImage(String imageFile) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    
	        } catch (Exception e) {
	            
	        }
	       
	    }
	
	public ImageMorph(int x, int y) {
		super(x, y);
		loadImage("NotAnImage.png");
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, xGetter(), yGetter(), widthGetter(), heightGetter(), null);
	}
}
