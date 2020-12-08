
public class rectangulo {

	private double vertice1;
	private double vertice2;
	private double vertice3;
	private double vertice4;
	private double base=vertice1;
	private double altura=vertice2;

	public rectangulo() {
		super();
		
	}
	
	public rectangulo(double vertice1, double vertice2, double vertice3, double vertice4) {
		
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
	}
	

	public rectangulo(double vertice1, double vertice2, double vertice3, double vertice4,double base,double altura) {
		
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
		this.vertice4 = vertice4;
		this.base = vertice1;
		this.altura = vertice2;
	}

	public double calcularsuperficie() {
		double s=0;
		s=base*altura;
		return s;
	}
	public void desplarectan(int punto, int distancia) {
	 System.out.println("la distancia es: "+ distancia);
	 System.out.println("El punto para desplazar: "+ punto);

	}
}
	
