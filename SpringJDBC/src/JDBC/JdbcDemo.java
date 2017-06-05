package JDBC;

public class JdbcDemo {

	public static void main(String[] args){
		
		Circle circle=new DAO().getCircle(1);
		System.out.println(circle.getName());
		
		
		
		
		
	}
	
	
	
	
	
	
}
