
public class Retangulo extends Poligono implements Diagonal {
	public Retangulo(double a, double b) {
		super(a, b);
	}
	@Override
	public double diagonal() {
		return Math.sqrt(Math.pow(getBase(), 2) + Math.pow(getAltura(), 2));
	}
}
