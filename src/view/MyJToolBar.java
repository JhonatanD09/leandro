package view;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

import model.Colors;

public class MyJToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	JComboBox<String> colorsBacokground, colorCircle, colorsBorderCircle;

	public MyJToolBar(ActionListener l) {
		setRollover(true);
		colorsBacokground = new JComboBox<>();
		editComboBox(colorsBacokground, "Selecciona el color de fondo", "bg", l);
		colorCircle = new JComboBox<>();
		editComboBox(colorCircle, "Selecciona el color de fondo del circulo", "c", l);
		colorsBorderCircle = new JComboBox<>();
		editComboBox(colorsBorderCircle, "Selecciona el color del borde del circulo", "bc", l);

		for (Colors c : Colors.values()) {
			colorsBacokground.addItem(c.name());
			colorCircle.addItem(c.name());
			colorsBorderCircle.addItem(c.name());
		}

		add(colorsBacokground);
		add(colorCircle);
		add(colorsBorderCircle);
	}

	private void editComboBox(JComboBox<String> box, String text, String name, ActionListener l) {
		box.setName(name);
		box.setBorder(BorderFactory.createTitledBorder(text));
		box.addActionListener(l);
	}

	public JComboBox<String> getColorsBacokground() {
		return colorsBacokground;
	}

	public JComboBox<String> getColorCircle() {
		return colorCircle;
	}

	public JComboBox<String> getColorsBorderCircle() {
		return colorsBorderCircle;
	}
}
