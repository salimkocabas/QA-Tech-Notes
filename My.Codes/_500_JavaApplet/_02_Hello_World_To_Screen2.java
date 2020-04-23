package _500_JavaApplet;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class _02_Hello_World_To_Screen2 extends Applet {

	public void paint(Graphics g) {

		this.setSize(new Dimension(750, 400));
		setBackground(Color.BLACK);

		Font font = new Font("Dialog", Font.BOLD, 72);
		g.setFont(font);
		g.setColor(Color.GREEN);

		String message = " Elion abi you are the Best!!!";
		g.drawString(message, 125, 225);

		g.setColor(Color.RED);
		g.drawRect(110, 150, 540, 100);
		g.drawRect(111, 151, 538, 98);
	}

}

