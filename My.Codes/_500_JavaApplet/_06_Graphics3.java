package _500_JavaApplet;

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _06_Graphics3 extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Graphics");

		// ekran cozunurlugu okundu
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// applet boyutu ayarlandi, monitorun yarisi
		frame.setSize(screenWidth / 2, screenHeight / 2);

		// ekranin ortasina yerlestirildi
		frame.setLocation(screenWidth / 4, screenHeight / 4);

		// apllet ekrana cikarildi
		_06_Graphics3 canvas = new _06_Graphics3();
		frame.add(canvas);
		frame.setVisible(true);

		// carpidan kapatilinca Java sonlansin
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics g) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		int size, x, y;
		int[] colorCode = { 0, 0, 0 };

		Random random = new Random();

		for (int i = 1; i < 1000; i++) {

			size = random.nextInt(100);

			x = random.nextInt(screenWidth / 2);
			y = random.nextInt(screenHeight / 2);

			// RGB Codes 0-255
			colorCode[0] = random.nextInt(255);
			colorCode[1] = random.nextInt(255);
			colorCode[2] = random.nextInt(255);
			g.setColor(new Color(colorCode[0], colorCode[1], colorCode[2]));
			g.drawOval(x, y, size, size);
		}

	}

}
