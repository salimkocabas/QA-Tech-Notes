package _500_JavaApplet;

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _11_Graphics9_ extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Graphics");

		// ekran cozunurlugu okundu
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// full screen
		frame.setSize(screenWidth, screenHeight);

		// sol ust koseye yerlestirildi
		frame.setLocation(0, 0);

		// apllet ekrana cikarildi
		_11_Graphics9_ canvas = new _11_Graphics9_();
		frame.add(canvas);
		frame.setVisible(true);

		// carpidan kapatilinca Java sonlansin
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics g) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		int centerX = screenWidth / 2;
		int centerY = screenHeight / 2;

		int r = 300;
		int x, y, x1, x2, y1, y2;

		x1 = centerX;
		y1 = centerY - r;
		x2 = centerX;
		y2 = centerY + r;

		g.drawLine(x1, y1, x2, y2);

		x1 = centerX - r;
		y1 = centerY;
		x2 = centerX + r;
		y2 = centerY;

		g.drawLine(x1, y1, x2, y2);

		g.setColor(Color.BLUE);

		for (double i = 0; i < r / 2; ) {

			i=i+0.2;
			
			x = (int) (centerX+(i*i));
			y = (int) (centerY+i);

			g.drawLine(x, y, x, y);
		}

	}

}
