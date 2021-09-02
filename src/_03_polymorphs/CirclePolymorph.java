package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph {
int angle = 0;
	CirclePolymorph(int x, int y) {
		super(x, y);
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillOval(xGetter(), yGetter(), widthGetter(), heightGetter());
		
	}
	public void update() {
		
		xSetter((int) (200 +Math.sin(angle)*widthGetter()));
		ySetter((int) (200 +Math.cos(angle)*widthGetter()));
		angle++;
	}
}
