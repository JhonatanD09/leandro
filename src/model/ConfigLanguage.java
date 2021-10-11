package model;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ConfigLanguage {
	
	private String bgColor;
	private String cColor;
	private String bcColor;
	private String radio;
	private String result;
	private String area;
	private String calculate;
	private String acessData;
	private String user;
	private String password;
	private String enter;
	
	public ConfigLanguage(String option) {
		ResourceBundle bundle;
		switch (OptionLanguage.valueOf(option.toUpperCase())) {
		case ESPAÑOL:
			bundle = PropertyResourceBundle.getBundle("resources/messages");
			extract(bundle);
			break;
		case INGLES:
			bundle = PropertyResourceBundle.getBundle("resources/messages",Locale.ENGLISH);
			extract(bundle);
			break;
		case FRANCES:
			bundle = PropertyResourceBundle.getBundle("resources/messages",Locale.FRANCE);
			extract(bundle);
			break;
		default:
			break;
		}
	}
	
	public void extract(ResourceBundle bundle) {
		bgColor = bundle.getString("background_color");
		cColor = bundle.getString("circle_color");
		bcColor = bundle.getString("border_circle_color");
		radio = bundle.getString("radius");
//		result = bundle.getString("area");
		area=  bundle.getString("area");
		calculate =  bundle.getString("calculate");
		acessData =  bundle.getString("access_data");
		user =  bundle.getString("user");
		password =  bundle.getString("password");
		enter =  bundle.getString("enter_buttom");
	}

	public String getBgColor() {
		return bgColor;
	}

	public void setBgColor(String bgColor) {
		this.bgColor = bgColor;
	}

	public String getcColor() {
		return cColor;
	}

	public void setcColor(String cColor) {
		this.cColor = cColor;
	}

	public String getBcColor() {
		return bcColor;
	}

	public void setBcColor(String bcColor) {
		this.bcColor = bcColor;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCalculate() {
		return calculate;
	}

	public void setCalculate(String calculate) {
		this.calculate = calculate;
	}

	public String getAcessData() {
		return acessData;
	}

	public void setAcessData(String acessData) {
		this.acessData = acessData;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEnter() {
		return enter;
	}

	public void setEnter(String enter) {
		this.enter = enter;
	}
	
	
}
