package model;

public enum Colors {
	BLACK("#000000"), YELLOW("#FFF600"), BLUE("#0027FF"), RED("#FF0000"), GREEN("#00FF00"), PURPLE("#9B00FF"),
	WHITE("#FFFFFF"), BROWN("#894A06"), ORANGE("#FF7B00"), CIAN("#00FFF3");

	private String hexaCode;

	private Colors(String hexacode) {
		hexaCode = hexacode;
	}

	public String getHexaCode() {
		return hexaCode;
	}
}
