package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class FollowerMorph extends Polymorph {

	
	FollowerMorph(int x, int y) {
		super(x, y);

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.orange);
		g.fillRect(xGetter(), yGetter(), widthGetter(), heightGetter());
	}
	public void update(){
		
	}

	

	

}
