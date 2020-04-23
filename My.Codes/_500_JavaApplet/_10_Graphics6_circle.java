package _500_JavaApplet;

import java.awt.*;
import javax.swing.JFrame;

@SuppressWarnings("serial")

public class _10_Graphics6_circle extends Canvas {

	public static void main(String[] args ) {
		_10_Graphics6_circle canvas = new _10_Graphics6_circle();
		
		JFrame frame = new JFrame("Circle");

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		frame.setSize(screenWidth, screenHeight);
		frame.setLocation(0, 0);
		frame.add(canvas);
		frame.setVisible(true);
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
		setBackground(Color.BLACK);

		g.setColor(Color.RED);
		message = "Circle x=sin(), y=cos()";
		g.drawString(message, 10, 80);

		int x, y;

		float z = 1F / 200F; // detay
		int CircleSize = 200;

		// daire ciziliyor
		g.setColor(Color.BLUE);
		for (double i = 0; i <= Math.PI * 2; i = i + z) {

			x = (int) ((Math.cos(i) * CircleSize) + centerX);
			y = (int) ((Math.sin(i) * CircleSize) + centerY);
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
