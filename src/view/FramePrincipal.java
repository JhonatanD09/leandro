package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FramePrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelViewCircle panelViewCircle;
	private PanelWest panelWest;
	
	public FramePrincipal() {
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new BorderLayout());
		
		panelViewCircle = new PanelViewCircle();
		panelWest = new PanelWest();
		
		
		add(panelViewCircle, BorderLayout.CENTER);
		add(panelWest,BorderLayout.WEST);
		
	}
	
	
}
