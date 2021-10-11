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

public class PanelWest extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField dataRadius, resultRadius;
	private ActionListener listener;


	public PanelWest(ActionListener listener) {
		this.listener = listener;
		setLayout(new GridLayout(7,1));
		setPreferredSize(new Dimension(400,0));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		
		dataRadius = new JTextField();
		editField(dataRadius, "Radio de la circunferencia");
		add(new JLabel());
		add(dataRadius);
		add(new JLabel());
		resultRadius = new JTextField();
		resultRadius.setEditable(false);
		editField(resultRadius, "Resultado del area de la circunferencia");
		add(resultRadius);
		add(new JLabel());
		add(editButton(Events.CALCULATE_AREA.name(), "Calcular y pintar"));
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
	
	
}
