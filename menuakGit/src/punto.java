
public class punto {

	private double x;
	
	private double y;

	public punto() {
		super();
		
	}

	public punto(double x, double y) {
		super();
		this.x = 0;
		this.y = 0;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public void obtenercoord() {

	System.out.println("Las coordenadas son: " +(+x+","+y));
	}
}


