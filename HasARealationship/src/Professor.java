
public class Professor {
	
	Address[] address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Professor p=new Professor();
p.address=new Address[2];
p.address[0]=new Address("langsford",822,"lees summit", 64086);		
p.address[1]=new Address("elangsford",821,"leessummit", 64114);		

for(int i=0;i<p.address.length;i++){
	p.address[i].printdetails();	
}
//System.out.println(p.address[0]);
	}

}
