package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
	Polymorph bluePoly;
	Polymorph redPoly;
	Polymorph movingPoly;
	Polymorph circlePoly;
	Polymorph followerPoly;
	Polymorph imagePoly;
	Polymorph messagePoly;
	ArrayList<Polymorph> polys;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(this);
		polys = new ArrayList<Polymorph>();
		bluePoly = new BluePolymorph(50, 50);
		redPoly = new RedMorph(100, 50);
		movingPoly = new MovingMorph(150, 50);
		circlePoly = new CirclePolymorph(200, 200);
		followerPoly = new FollowerMorph(200, 50);
		imagePoly = new ImageMorph(250,50);
		messagePoly = new MessageMorph(400,50);
		polys.add(bluePoly);
		polys.add(redPoly);
		polys.add(movingPoly);
		polys.add(circlePoly);
		polys.add(followerPoly);
		polys.add(imagePoly);
		polys.add(messagePoly);
		window.addMouseListener((MessageMorph) messagePoly);
		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (int i = 0; i < polys.size(); i++) {
			polys.get(i).draw(g);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (int i = 0; i < polys.size(); i++) {
			polys.get(i).update();
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		for (int i = 0; i < polys.size(); i++) {
			if (polys.get(i) instanceof FollowerMorph) {
				polys.get(i).xSetter(e.getX()-25);
				polys.get(i).ySetter(e.getY()-polys.get(i).heightGetter());
			}
		}
	}
}
