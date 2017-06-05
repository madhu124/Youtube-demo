package service;

import DAO.UserDAO;
import TransferObject.UserTo;

public class UserService {
public boolean validatePassword(String userId,String password){
	UserDAO userDAO=new UserDAO();
	UserTo to=userDAO.getUser(userId);
	if(password.equals(to.getPassword())){
		return true;
	}
	else{
		return false;
	}
	
}
}
