package model;

public class User {
	
	private String userName;
	private String password;

	public User(String userInfo) {
		String[] list = userInfo.split(";");
		this.userName = list[0];
		this.password = list[1];		
	}
	
	public boolean verifyUser(String hUserName, String hPassword) {
		return (hUserName.equals(userName) && hPassword.equals(password));
	}
}

