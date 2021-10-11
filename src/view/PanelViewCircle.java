package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.MyCircle;

public class PanelViewCircle extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MyCircle circle;
	
	public PanelViewCircle() {
		this.circle = null;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (circle!=null) {	
			g.setColor(Color.decode(circle.getColorCircle()));
			g.fillOval(50, 50, (int)circle.getRadio()*2, (int)circle.getRadio()*2);
			g.setColor(Color.decode(circle.getColorBorderCircle()));
			g.drawOval(50, 50, (int)circle.getRadio()*2, (int)circle.getRadio()*2);
		}
	}

	public void setCircle(MyCircle circle) {
		this.circle = circle;
		setBackground(Color.decode(circle.getColorBackground()));
		revalidate();
		repaint();
	}
}
