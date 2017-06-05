package TransferObject;

public class UserTo {
String UserId;
String password;
boolean disabled;
public String getUserId() {
	return UserId;
}
public void setUserId(String userId) {
	UserId = userId;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean isDisabled() {
	return disabled;
}
public void setDisabled(boolean disabled) {
	this.disabled = disabled;
}

}
