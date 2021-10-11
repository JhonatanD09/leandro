package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import model.MyCircle;

public class FramePrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelViewCircle panelViewCircle;
	private PanelWest panelWest;
	private MyJToolBar  jToolBar;
	private JPanelLogin logPane;
	
	public FramePrincipal(ActionListener listener) {
		
		this.showLogin(listener);
		
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panelViewCircle = new PanelViewCircle();
		panelWest = new PanelWest(listener);
		jToolBar = new MyJToolBar(listener);
		
		add(jToolBar, BorderLayout.NORTH);
		add(panelViewCircle, BorderLayout.CENTER);
		add(panelWest,BorderLayout.WEST);
		
	}
	
	public void showLogin(ActionListener listener) {
		logPane = new JPanelLogin(listener);
		
		logPane.setVisible(true);
	}
	
	public void setArea(double area) {
		panelWest.setArea(area);
	}
	
	public double getCircleRadio(){
		return panelWest.getRadius();
	}

	public void setCircle(MyCircle circle) {
		panelViewCircle.setCircle(circle);
	}
	
	public JComboBox<String> getBackgroundColor(){
		return jToolBar.getColorsBacokground();
	}
	
	public JComboBox<String> getCircleColor(){
		return jToolBar.getColorCircle();
	}
	
	public JComboBox<String> getBorderColor(){
		return jToolBar.getColorsBorderCircle();
	}

	public void deleteLogin() {
		logPane.dispose();
		
	}
}
