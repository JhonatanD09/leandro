package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Events;
import model.ConfigLanguage;
import model.MyCircle;

public class FramePrincipal extends JFrame{

	private static final long serialVersionUID = 1L;

	private PanelViewCircle panelViewCircle;
	private PanelWest panelWest;
	private MyJToolBar  jToolBar;
	private JPanelLogin logPane;
	private ConfigLanguage configLanguage;
	
	public FramePrincipal(ActionListener listener, ConfigLanguage configLanguage) {
		
		this.configLanguage = configLanguage;
		init(listener, configLanguage);
		this.showLogin(listener);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelViewCircle = new PanelViewCircle();
		panelWest = new PanelWest(listener, this.configLanguage);
		jToolBar = new MyJToolBar(listener, this.configLanguage);
		
		JMenuBar bar = new JMenuBar();
		bar.add(configMenuItem(Events.EN.name(), "EN", listener));
		bar.add(configMenuItem(Events.ES.name(), "ES", listener));
		bar.add(configMenuItem(Events.FRAN.name(), "FRAN", listener));
		
		setJMenuBar(bar);
		
		
		add(jToolBar, BorderLayout.NORTH);
		add(panelViewCircle, BorderLayout.CENTER);
		add(panelWest,BorderLayout.WEST);
	}

	private void init(ActionListener listener, ConfigLanguage configLanguage) {
		
	}
	
	private JMenuItem configMenuItem(String command, String text, ActionListener l) {
		JMenuItem item = new JMenuItem(text);
		item.addActionListener(l);
		item.setActionCommand(command);
		return item;
	}
	
	public void showLogin(ActionListener listener) {
		logPane = new JPanelLogin(listener, configLanguage);
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
	
	public void updateLanguaje(ActionListener listener , ConfigLanguage configLanguage) {
		this.configLanguage = configLanguage;
		init(listener, configLanguage);
		panelWest.update(configLanguage);
		jToolBar.update(listener, configLanguage);
//		logPane.update(listener,configLanguage);
		revalidate();
		repaint();
	}
}
