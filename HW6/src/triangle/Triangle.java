package triangle;

public class Triangle {
	float x, y, z;
	float area;
	
	Triangle(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void getArea() throws NotTriangleException {
		if(x+y<=z || x+z<=y || y+z<=x) {
			throw new NotTriangleException("input error to get area");
		}
		else {
			float s = (x+y+z)/2;
			area = (float) Math.sqrt(s*(s-x)*(s-y)*(s-z));
			System.out.println(area);
		}
	}
	
	public void showInfo() throws NotTriangleException {
		if(x+y<=z || x+z<=y || y+z<=x) {
			throw new NotTriangleException("input error to show info");
		}
		else {
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
		}
		
	}
}

@SuppressWarnings("serial")
class NotTriangleException extends Exception {
	public NotTriangleException() {
	}
	public NotTriangleException(String msg) {
		super(msg);
	}
}
