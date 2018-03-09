
public class Quadrado extends Poligono implements Diagonal {
	public Quadrado(double a, double b) {
		super(a, b);
	}
	@Override
	public double diagonal() {
		return getAltura() * Math.sqrt(2);
	}
}
