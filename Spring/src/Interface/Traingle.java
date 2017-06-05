package Interface;

public class Traingle implements Shape {
	int x;
	int y;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

		@Override
		public void draw() {
			System.out.println("("+getX()+","+getY()+")");		
		}
		
		public void afterPropertiesSet() throws Exception {
			System.out.println("LifeCycle of Traingle begin");	
			}

			@Override
			public void destroy() throws Exception {

				System.out.println("LifeCycle of Traingle ends");	
			}
	
	
}
