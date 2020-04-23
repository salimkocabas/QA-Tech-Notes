package _500_JavaApplet;

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _09_Graphics5_sine_graphic extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("sin()");

		// ekran cozunurlugu okundu
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// full screen
		frame.setSize(screenWidth, screenHeight);

		// sol ust koseye yerlestirildi
		frame.setLocation(0, 0);

		// apllet ekrana cikarildi
		_09_Graphics5_sine_graphic canvas = new _09_Graphics5_sine_graphic();
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

		Font font = new Font("Dialog", Font.BOLD, 24);
		g.setFont(font);
		g.setColor(Color.BLUE);

		String message = "sin()";
		g.drawString(message, 10, 40);

		int x, y;

		g.setColor(Color.BLUE);

		float z = 1F / 100F; // detay
		int graphSizeX = 50;
		int graphSizeY = 200;

		for (double i = -15; i <= 15; i = i + z) {

			x = (int) (i * graphSizeX) + centerX;
			y = (int) ((Math.sin(i) * graphSizeY) + centerY);
			g.drawLine(x, y, x, y);
			
			//yavas cizmesi icin
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
