package _500_JavaApplet;

import java.awt.*;
import java.applet.*;

@SuppressWarnings("serial")
public class YouAreTheKing extends Applet {

	public void paint(Graphics g) {

		this.setSize(new Dimension(1250, 400));
		setBackground(Color.GREEN);

		Font font = new Font("Dialog", Font.BOLD, 72);
		g.setFont(font);
		g.setColor(Color.BLUE);

		String message = " Elion abi you are the KING!!!";
		g.drawString(message, 125, 225);
	}

}
