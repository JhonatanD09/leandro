package utilities;

import java.time.LocalTime;;

public class FileVerifier {
	public static final String REGEX_DIVISOR = ";";
	public static final String REGEX_PATTERN = "^[A-Z]{1}";

	public FileVerifier() {
	}

	public String[] catchCalculatorInfo() {
		String[] calculatorList;
		Archivos arch = new Archivos("info/calcules.info");
		arch.open('r');
		calculatorList = new String[countSize("info/calcules.info")];
		arch.open('r');
		for (int i = 0; i < calculatorList.length; i++) {
			calculatorList[i] = arch.read();
		}
		arch.close();
		return calculatorList;
	}

	public int countSize(String route) {
		Archivos arch = new Archivos(route);
		int count = 0;
		arch.open('r');
		while ((arch.read()) != null)
			count++;
		return count;
	}

	public String[] divideString(String line) {
		return line.split(REGEX_DIVISOR);
	}
	
	public void writteCalculatorFile(String[] calculatorList) {
		Archivos arch = new Archivos("info/calcules.info");
		arch.open('w');
		for (int i = 0; i < calculatorList.length; i++) {
			arch.record(calculatorList[i]);
		}
		arch.close();
	}
	
	public String[] catchUsersInfo() {
		String[] usersList;
		Archivos arch = new Archivos("info/users.info");
		arch.open('r');
		usersList = new String[countSize("info/users.info")];
		arch.open('r');
		for (int i = 0; i < usersList.length; i++) {
			usersList[i] = arch.read();
		}
		arch.close();
		return usersList;
	}
	
	public void writteUsersFile(String[] usersList) {
		Archivos arch = new Archivos("info/users.info");
		arch.open('w');
		for (int i = 0; i < usersList.length; i++) {
			arch.record(usersList[i]);
		}
		arch.close();
	}

}
