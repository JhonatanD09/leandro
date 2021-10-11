package view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelViewCircle extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public PanelViewCircle() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		int x = (getWidth()/2)-100;
		int y = (getHeight()/2)-250;
		g.drawOval(x, y, 500, 500);
	}
}
