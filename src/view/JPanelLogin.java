package view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controller.Events;



public class JPanelLogin extends JDialog{
	
	public static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int WIDTH_SIZE = (int) (dimension.getWidth());
    public static final int HEIGHT_SIZE = (int) (dimension.getHeight());
    public JPanel principalPanel;
    public JLabel tittle;
    public JTextField userName;
    public JTextField password;
    public JButton acceptButton;
	
	public JPanelLogin(ActionListener listener) {
		JPanel tempPane = new JPanel(new GridLayout(2,1));
		Font localFont = new Font("Arial", Font.PLAIN, 20);
		this.principalPanel = new JPanel(new BorderLayout());
		this.principalPanel.setBackground(Color.WHITE);
		this.setSize(new Dimension(600,300));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
//		this.setUndecorated(true);
		
		tittle = new JLabel("por favor ingrese su usuario y contrasenia");
		tittle.setFont(localFont);
		
		userName = new JTextField();
		userName.setFont(localFont);
		userName.setBackground(Color.WHITE);
		userName.setBorder(new TitledBorder("nombe de usuario"));
		
		password = new JTextField();
		password.setFont(localFont);
		password.setBackground(Color.WHITE);
		password.setBorder(new TitledBorder("clave de acceso"));
		
		acceptButton = new JButton("ingresar");
		acceptButton.setBorder(new LineBorder(Color.BLACK));
		acceptButton.setBackground(Color.WHITE);
		acceptButton.setActionCommand(Events.ACCEPT_LOGIN.name());
		acceptButton.addActionListener(listener);
		
		
		this.principalPanel.add(tittle, BorderLayout.NORTH);
		tempPane.add(userName);
		tempPane.add(password);
		this.principalPanel.add(tempPane, BorderLayout.CENTER);
		this.principalPanel.add(acceptButton, BorderLayout.SOUTH);
		this.add(principalPanel);
	}

}
