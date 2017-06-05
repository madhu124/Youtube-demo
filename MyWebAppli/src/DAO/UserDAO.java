package DAO;
import TransferObject.UserTo;
public class UserDAO {
public UserTo getUser(String userId){
	UserTo to=new UserTo();
	to.setUserId(userId);
	to.setPassword("1234");
	//to.setDisabled(disabled);
	return to;
}
}
