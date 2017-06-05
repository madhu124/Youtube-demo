import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class StudentDAO {

	public static StudentTo getStudent(int studid){
		
		Connection conn=ConnectionManager.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs1=null;
		StudentTo to=null;
		try {
			//Statement st=c.createStatement();
		
		String pQuery="select * from student where id = ?";
	 pstmt=conn.prepareStatement(pQuery);
		pstmt.setInt(1, studid);
	rs1=pstmt.executeQuery();
		int id=0;
		String name=null;
		String subject=null;
		
		while(rs1.next()){
			id=rs1.getInt("id");
			name=rs1.getString("name");
			subject=rs1.getString("subject");
}
		to =new StudentTo(id,name,subject);
		

		
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally{
			try {
				pstmt.close();
				rs1.close();
				
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return to;
		
		
		}
		
		
	
	
	
	
}
