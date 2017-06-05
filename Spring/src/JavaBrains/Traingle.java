package JavaBrains;

public class Traingle {
String tye;

int height;

	public Traingle(String tye, int height) {
	super();
	this.tye = tye;
	this.height = height;
	
}
	public Traingle(String tye) {
		super();
		this.tye = tye;
	}

	public int getHeight() {
	return height;
}

	

	public String getTye() {
	return tye;
}

public void setType(String tye) {
	this.tye = tye;
}

	public void draw(){
		System.out.println(getTye() + " Traingle drawn  " +" height is "+ getHeight()); 
	}
}
