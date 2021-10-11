package view;

import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JToolBar;

import model.Colors;
import model.ConfigLanguage;

public class MyJToolBar extends JToolBar {

	private static final long serialVersionUID = 1L;
	JComboBox<String> colorsBacokground, colorCircle, colorsBorderCircle;
	private ConfigLanguage configLanguage;

	public MyJToolBar(ActionListener l, ConfigLanguage configLanguageL) {
		init(l, configLanguageL);
	}

	private void init(ActionListener l, ConfigLanguage configLanguageL) {
		this.configLanguage = configLanguageL;
		setRollover(true);
		colorsBacokground = new JComboBox<>();
		editComboBox(colorsBacokground,configLanguage.getBgColor(), "bg", l);
		colorCircle = new JComboBox<>();
		editComboBox(colorCircle,configLanguage.getcColor(), "c", l);
		colorsBorderCircle = new JComboBox<>();
		editComboBox(colorsBorderCircle, configLanguage.getBcColor(), "bc", l);

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

	public void update(ActionListener L, ConfigLanguage configLanguage) {
		this.configLanguage = configLanguage;
		removeAll();
		init(L, configLanguage);
		revalidate();
		repaint();
	}
}
