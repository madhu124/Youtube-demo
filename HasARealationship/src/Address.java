
public class Address extends Professor{
	String stname;
	int stNo;
	String area;
	int Zipcode;
	Address(){
		
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getStNo() {
		return stNo;
	}
	public void setStNo(int stNo) {
		this.stNo = stNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getZipcode() {
		return Zipcode;
	}
	public void setZipcode(int zipcode) {
		Zipcode = zipcode;
	}
	public Address(String stname,int stNo,String area,int Zipcode){
		this.stname=stname;
		this.stNo=stNo;
		this.area=area;
		this.Zipcode=Zipcode;
	}
	public void printdetails(){
		System.out.println(stname + stNo + area + Zipcode);
	}
	
public static void main(String[] args){
	
	// null point exception
	
	Student s1=null;
	Address a=new Address();
	/*try{
	s1.getId(); }
	catch(NullPointerException e){
		System.out.println("null point ecxeption occured");
		System.out.println(e.getMessage());
	}*/
	// typecast exception
	
	Professor p1=new Student();
	Professor p2=new Address();
	//System.out.println(((Student)p1).getId());
	/*try{
	((Student)p2).getId(); // error due to the student cant be converted to address.
	
	}
	catch(ClassCastException e){
		System.out.println("type cast error occured");
		System.out.println(e.getMessage());
	}*/
	// to avoid type casting we can use instanceof operator
	if(p1 instanceof Student){
		((Student)p1).getId();
		
	}
	else{
		((Student)p2).getId();
	}
	
}
}
