package model;

public class MyCircle {

	private double radio;
	private String  colorBackground, colorCircle, colorBorderCircle;

	public MyCircle(double radio) {
		this.radio = radio;
		colorBackground = Colors.WHITE.getHexaCode();
		colorCircle = Colors.CIAN.getHexaCode();
		colorBorderCircle = Colors.BLACK.getHexaCode();
	}

	public double calculateArea() {
		return Math.PI * Math.pow(radio, 2);
	}

	public String getColorBackground() {
		return colorBackground;
	}
	
	public String getColorBorderCircle() {
		return colorBorderCircle;
	}
	
	public String getColorCircle() {
		return colorCircle;
	}

	public void setColorBackground(Colors c) {
		this.colorBackground = c.getHexaCode();
	}
	
	public void setColorBorderCircle(Colors c) {
		this.colorBorderCircle = c.getHexaCode();
	}
	
	public void setColorCircle(Colors c) {
		this.colorCircle = c.getHexaCode();
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
}
