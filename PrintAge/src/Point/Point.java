package Point;

public class Point {

	private int x; 
	private int y;
	
	public Point(int x, int y) throws PointException{
		
		if(x < 0 || y < 0) {
			throw new PointException();
		}
		else {
			this.x = x;
			this.y = y;	
		}
		
	}
	
	//make other points
	public Point(Point P) throws PointException {
		if(x < 0 || y < 0) {
			throw new PointException();
		}else {
			this.x = P.x;
			this.y = P.y;
		}
		
	}
	
	//getters
	public int getX() {
		return x;		
	}
	public int getY() {
		return y;		
	}
	
	//setters	
	public int setX(int x) throws PointException {
		if(x < 0) throw new PointException(); 
		else {
			this.x = x;
			return x;
		}
		
	}
	public int setY(int y) throws PointException{
		if(y < 0) throw new PointException();
		else {
			this.y = y;
			return y;
		}
		
	}
	
	//movements
	public int moveR(){
		try {
			return setX(getX() + 1);
		}catch(PointException e) {
			return 0;
		}
		 
	}
	public int moveL(){
		try {
			return setX(getX() - 1);
		}catch(PointException e) {
			return 0;
		}
		
	}
	public int moveU(){
		try {
			return setY( getY() + 1);
		}catch(PointException e) {
			return 0;
		}
		
	}
	public int moveB(){
		try {
			return setY(getY() - 1);
		}catch(PointException e) {
			return 0;
		}
		
	}
	


}
