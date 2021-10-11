package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import controller.Events;
import model.ConfigLanguage;



public class JPanelLogin extends JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
	public static final int WIDTH_SIZE = (int) (dimension.getWidth());
    public static final int HEIGHT_SIZE = (int) (dimension.getHeight());
    public JPanel principalPanel;
    public JLabel tittle;
    public JTextField userName;
    public JPasswordField password;
    public JButton acceptButton;
    private ConfigLanguage language;
	
	public JPanelLogin(ActionListener listener, ConfigLanguage languageL) {
		init(listener, languageL);
	}

	private void init(ActionListener listener, ConfigLanguage languageL) {
		this.language = languageL;
		JPanel tempPane = new JPanel(new GridLayout(2,1));
		Font localFont = new Font("Arial", Font.PLAIN, 20);
		this.principalPanel = new JPanel(new BorderLayout());
		this.principalPanel.setBackground(Color.WHITE);
		this.setSize(new Dimension(600,300));
		this.setLocationRelativeTo(null);
		this.setResizable(false);
//		this.setUndecorated(true);
		
		tittle = new JLabel(language.getAcessData());
		tittle.setFont(localFont);
		
		userName = new JTextField();
		userName.setFont(localFont);
		userName.setBackground(Color.WHITE);
		userName.setBorder(new TitledBorder(language.getUser()));
		
		password = new JPasswordField();
		password.setFont(localFont);
		password.setBackground(Color.WHITE);
		password.setBorder(new TitledBorder(language.getPassword()));
		
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

	public void update(ActionListener l, ConfigLanguage configLanguage) {
		this.language = configLanguage;
		init(l, configLanguage);
		revalidate();
		repaint();
	}

}
