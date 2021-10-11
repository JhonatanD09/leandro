package model;

public enum Colors {
	WHITE("#FFFFFF"), YELLOW("#FFF600"), BLUE("#0027FF"), RED("#FF0000"), GREEN("#00FF00"), PURPLE("#9B00FF"),
	BLACK("#000000"), BROWN("#894A06"), ORANGE("#FF7B00"), CIAN("#00FFF3");

	private String hexaCode;

	private Colors(String hexacode) {
		hexaCode = hexacode;
	}

	public String getHexaCode() {
		return hexaCode;
	}
}
