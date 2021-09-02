package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
	private int x;
	private int y;
	private int width = 50;
	private int height = 50;

	public int xGetter() {
		return x;
	}

	public int yGetter() {
		return y;
	}

	public int widthGetter() {
		return width;
	}

	public int heightGetter() {
		return height;
	}

	public void xSetter(int temp) {
		x = temp;
	}

	public void ySetter(int temp) {
		y = temp;
	}

	public void widthSetter(int temp) {
		width = temp;
	}

	public void heightSetter(int temp) {
		height = temp;
	}

	Polymorph(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void update() {

	}

	public abstract void draw(Graphics g);
}
