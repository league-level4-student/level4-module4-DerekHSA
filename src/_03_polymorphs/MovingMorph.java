package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	MovingMorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(xGetter(), yGetter(), widthGetter(), heightGetter());		
	}
	
	public void update() {
		ySetter(yGetter()+2);
	}

}
