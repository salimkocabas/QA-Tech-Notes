package _500_JavaApplet;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class _01_Hello_World_To_Screen extends Applet {

	public void paint(Graphics g) {

		this.setSize(new Dimension(750, 400));
		setBackground(Color.GREEN);

		Font font = new Font("Dialog", Font.BOLD, 72);
		g.setFont(font);
		g.setColor(Color.BLUE);

		String message = " Hello World!!!";
		g.drawString(message, 125, 225);
	}

}
