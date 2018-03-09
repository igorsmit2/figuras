import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Figura> fig = new ArrayList<Figura>();
		
		fig.add(new Losango		(3, 5));
		fig.add(new Quadrado	(4, 4));
		fig.add(new Triangulo	(5, 8));
		fig.add(new Retangulo   (8, 4));
		
		for(Figura figu:fig) {
			System.out.println(figu.area());
			
			if(figu instanceof Diagonal) {
				System.out.println(((Diagonal)figu).diagonal());
				
			}
		}
		
			// Fim
		System.exit(0);
	}

}
