package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelWest extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JTextField dataRadius, resultRadius;

	public PanelWest() {
		setLayout(new GridLayout(7,1));
		setPreferredSize(new Dimension(400,0));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		
		dataRadius = new JTextField();
		editField(dataRadius, "Radio de la circunferencia");
		add(new JPanel());
		add(dataRadius);
		add(new JPanel());
		resultRadius = new JTextField();
		resultRadius.setEditable(false);
		editField(resultRadius, "Resultado del area de la circunferencia");
		add(resultRadius);
		add(new JPanel());
		add(new JButton("Calcular y pintar"));
		add(new JPanel());
	}
	
	private void editField(JTextField field, String title) {
		field.setBorder(BorderFactory.createTitledBorder(title));
	}
}
