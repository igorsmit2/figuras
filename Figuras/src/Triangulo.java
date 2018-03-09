
public class Triangulo extends Poligono {
	public Triangulo(double a, double b) {
		super(a, b);
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		return super.area()/2;
	}
}
