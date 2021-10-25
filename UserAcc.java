public class UserAcc{
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) throws UserException{
		check(userName);
		this.userName = userName;
		
	}
	public void setPassword(String password) throws UserException{
		check(password);
		this.password = password;
	}

	private void check(String str)throws UserException{
		if(str == null) {
			throw new UserException("Null error");
		}
		if(str.length() < 5) {
			throw new UserException("Length error");
		}
	}
	
}
