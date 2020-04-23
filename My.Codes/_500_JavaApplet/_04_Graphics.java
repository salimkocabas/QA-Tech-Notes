package _500_JavaApplet;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _04_Graphics extends Canvas {

	public static void main(String[] args) {
		JFrame w = new JFrame("Graphics");
		w.setSize(800, 600);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_04_Graphics canvas = new _04_Graphics();
		w.add(canvas);
		w.setVisible(true);

	}

	public void paint(Graphics g) {
		setBackground(Color.BLACK);
		g.setColor(Color.green);
		g.drawRect(50, 20, 100, 200);
		g.fillOval(160, 20, 100, 200);
		g.setColor(Color.blue);
		g.fillRect(200, 400, 200, 20);
		g.drawOval(200, 430, 200, 100);
		g.setColor(Color.red);
		g.drawLine(100, 100, 500, 100);
		g.setColor(Color.black);
		g.drawString("Graphics are pretty neat.", 500, 100);
		int x = getWidth() / 2;
		int y = getHeight() / 2;
		g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
	}

}
