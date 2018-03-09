
public abstract class Poligono extends Figura {
		private double base;
		private double altura;
		
			// Construtor
		public Poligono(double b, double a) {
			this.setBase(b);
			this.setAltura(a);
		}
		
		@Override
		double area() {
			return base*altura;
		}
		
			// Métodos Getters And Setters
		public double getBase() {
			return base;
		}
		public void setBase(double base) {
			this.base = base;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
}
