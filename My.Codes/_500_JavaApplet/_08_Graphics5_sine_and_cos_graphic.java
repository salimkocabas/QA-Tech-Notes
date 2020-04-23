package _500_JavaApplet;


import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class _08_Graphics5_sine_and_cos_graphic extends Canvas {

	public static void main(String[] args) {

		JFrame frame = new JFrame("sin() & cos()");

		// ekran cozunurlugu okundu
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		// full screen
		frame.setSize(screenWidth, screenHeight);

		// sol ust koseye yerlestirildi
		frame.setLocation(0, 0);

		// apllet ekrana cikarildi
		_08_Graphics5_sine_and_cos_graphic canvas = new _08_Graphics5_sine_and_cos_graphic();
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
		String message;
		
		Font font = new Font("Dialog", Font.BOLD, 24);
		g.setFont(font);
		
		g.setColor(Color.BLUE);
		message = "sin()";
		g.drawString(message, 10, 40);

		g.setColor(Color.RED);
		message = "cos()";
		g.drawString(message, 10, 80);
		
		
		
		int x, y;

		float z = 1F / 100F; // detay
		int graphSizeX = 50;
		int graphSizeY = 200;

		// SINUS
		g.setColor(Color.BLUE);
		for (double i = -15; i <= 15; i = i + z) {

			x = (int) (i * graphSizeX) + centerX;
			y = (int) ((Math.sin(i) * graphSizeY) + centerY);
			g.drawLine(x, y, x, y);

			// yavas cizmesi icin
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// COSINUS
		g.setColor(Color.RED);
		for (double i = -15; i <= 15; i = i + z) {

			x = (int) (i * graphSizeX) + centerX;
			y = (int) ((Math.cos(i) * graphSizeY) + centerY);
			g.drawLine(x, y, x, y);

			// yavas cizmesi icin
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
