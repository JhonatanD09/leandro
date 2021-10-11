package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FramePrincipal;

public class Controller implements ActionListener{
	
	private FramePrincipal framePrincipal;

	
	public Controller() {
		this.framePrincipal = new FramePrincipal();
		framePrincipal.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new Controller();
	}
}
