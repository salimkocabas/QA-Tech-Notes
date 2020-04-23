package _500_JavaApplet;

import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _05_Graphics2 extends Canvas {

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
		_05_Graphics2 canvas = new _05_Graphics2();
		frame.add(canvas);
		frame.setVisible(true);

		// carpidan kapatilinca Java sonlansin
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void paint(Graphics g) {

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		int x1, y1,x2,y2;
		int[] colorCode = { 0, 0, 0 };

		Random random = new Random();

		for (int i = 1; i < 1000; i++) {


			x1 = random.nextInt(screenWidth / 2);
			y1 = random.nextInt(screenHeight / 2);
			x2 = random.nextInt(screenWidth / 2);
			y2 = random.nextInt(screenHeight / 2);
			
			// RGB Codes 0-255
			colorCode[0] = random.nextInt(255);
			colorCode[1] = random.nextInt(255);
			colorCode[2] = random.nextInt(255);
			g.setColor(new Color(colorCode[0], colorCode[1], colorCode[2]));
			g.drawLine(x1, y1, x2, y2);
		}

	}

}
