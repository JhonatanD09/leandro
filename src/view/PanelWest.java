package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Events;
import model.ConfigLanguage;

public class PanelWest extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField dataRadius, resultRadius;
	private ActionListener listener;
	private ConfigLanguage configLanguage;


	public PanelWest(ActionListener listener, ConfigLanguage configLanguageL) {
		init(listener, configLanguageL);
	}

	private void init(ActionListener listener, ConfigLanguage configLanguageL) {
		this.listener = listener;
		this.configLanguage = configLanguageL;
		setLayout(new GridLayout(7,1));
		setPreferredSize(new Dimension(400,0));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		
		dataRadius = new JTextField();
		editField(dataRadius, configLanguage.getRadio());
		add(new JLabel());
		add(dataRadius);
		add(new JLabel());
		resultRadius = new JTextField();
		resultRadius.setEditable(false);
		editField(resultRadius, configLanguage.getArea());
		add(resultRadius);
		add(new JLabel());
		add(editButton(Events.CALCULATE_AREA.name(),configLanguage.getCalculate()));
		add(new JLabel());
	}
	
	private void editField(JTextField field, String title) {
		field.setBorder(BorderFactory.createTitledBorder(title));
		Font font = new Font("Times new roman", Font.BOLD, 50);
		field.setFont(font);
		field.setBackground(Color.WHITE);
	}
	
	private JButton editButton(String name, String text) {
		JButton button = new JButton(text);
		button.setActionCommand(name);
		button.addActionListener(listener);
		return button;
	}

	public void setArea(double area) {
		DecimalFormat df = new DecimalFormat("#.00");
		resultRadius.setText(df.format(area));
		revalidate();
		repaint();
	}
	
	public double getRadius() {
		return  Double.parseDouble(dataRadius.getText());
	}

	public void update(ConfigLanguage configLanguage) {
		removeAll();
		this.configLanguage = configLanguage;
		init(listener, configLanguage);
		revalidate();
		repaint();
	}
	
	
}
