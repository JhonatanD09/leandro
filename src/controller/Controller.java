package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Colors;
import model.ConfigLanguage;
import model.MyCircle;
import view.FramePrincipal;

public class Controller implements ActionListener {

	private FramePrincipal framePrincipal;
	private MyCircle circle;
	private ConfigLanguage configLanguage;

	public Controller() {
		configLanguage = new ConfigLanguage("INGLES");
		this.framePrincipal = new FramePrincipal(this,configLanguage);
		circle = new MyCircle(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (framePrincipal != null) {
			Object source = e.getSource();
			if (source == framePrincipal.getBackgroundColor()) {
				circle.setColorBackground(
						Colors.valueOf((String) framePrincipal.getBackgroundColor().getSelectedItem()));
				framePrincipal.setCircle(circle);
			} else if (source == framePrincipal.getCircleColor()) {
				circle.setColorCircle((Colors.valueOf((String) framePrincipal.getCircleColor().getSelectedItem())));
				framePrincipal.setCircle(circle);
			} else if (source == framePrincipal.getBorderColor()) {
				circle.setColorBorderCircle(
						(Colors.valueOf((String) framePrincipal.getBorderColor().getSelectedItem())));
				framePrincipal.setCircle(circle);
			} else {
				switch (Events.valueOf(e.getActionCommand())) {
				case CALCULATE_AREA:
					circle = new MyCircle(framePrincipal.getCircleRadio());
					framePrincipal.setArea(circle.calculateArea());
					framePrincipal.setCircle(circle);
					break;
				case ACCEPT_LOGIN:
					framePrincipal.deleteLogin();
					framePrincipal.setVisible(true);
					break;
				case EN:
					System.out.print("Hola");
					configLanguage = new ConfigLanguage("INGLES");
					framePrincipal.updateLanguaje(this, configLanguage);
					break;
				case ES:
					System.out.print("Hola es");
					configLanguage = new ConfigLanguage("ESPAÑOL");
					framePrincipal.updateLanguaje(this, configLanguage);
					break;
				case FRAN:
					System.out.print("Hola fr");
					configLanguage = new ConfigLanguage("FRANCES");
					framePrincipal.updateLanguaje(this, configLanguage);
					break;
				}
				
			
			}

		}

	}

	public static void main(String[] args) {
		new Controller();
	}


}