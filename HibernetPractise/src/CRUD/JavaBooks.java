package CRUD;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JavaBooks {

	@Id
	@GeneratedValue
	@Column(name="Book_Id")
	int Bookid;
	
	@Column(name="Book_Name")
	String Bookname;

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	
	
	
}
