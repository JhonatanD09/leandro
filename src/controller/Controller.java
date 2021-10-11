package controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;

import model.Colors;
import model.MyCircle;
import view.FramePrincipal;

public class Controller implements ActionListener {

	private FramePrincipal framePrincipal;
	private MyCircle circle;

	public Controller() {
		this.framePrincipal = new FramePrincipal(this);
		circle = new MyCircle(100);
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
				}
			}

		}

	}

	public static void main(String[] args) {
		new Controller();
	}


}