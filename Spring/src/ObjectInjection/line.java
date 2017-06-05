package ObjectInjection;

public class line {

	
	point p1;
	point p2;
	point p3;

	public point getP1() {
		return p1;
	}
	public void setP1(point p1) {
		this.p1 = p1;
	}
	public point getP2() {
		return p2;
	}
	public void setP2(point p2) {
		this.p2 = p2;
	}
	public point getP3() {
		return p3;
	}
	public void setP3(point p3) {
		this.p3 = p3;
	}
		

	public void print(){
		System.out.println("point 1 " + "(" + getP1().getX() + "," + getP1().getY()+ ")");
		System.out.println("point 2 " + "(" + getP2().getX() + "," + getP2().getY()+ ")");
		System.out.println("point 3 " + "(" + getP3().getX() + "," + getP3().getY()+ ")");

	}
}
