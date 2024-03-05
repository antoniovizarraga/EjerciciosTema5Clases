package tema5clases.ejercicio03;

public class Punto {
	/**
	 * Atributo que representa el punto x.
	 */
	private int x;
	
	/**
	 * Atributo que representa el punto y.
	 */
	private int y;
	
	/**
	 * Función constructora que toma como parámetros los atributos.
	 * @param x Coge el atributo x como parámetro.
	 * @param y Coge el atributo y como parámetro.
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Función que imprime las coordenadas.
	 */
	public void imprime() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	/**
	 * Función que devuelve el atributo X.
	 * @return Devuelve el atributo X.
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Función que devuelve el atributo Y.
	 * @return Devuelve el atributo Y.
	 */
	public int getY() {
		return y;
	}
	
	/**
	 * Función que establece los puntos X e Y.
	 * @param x Atributo X como parámetro-
	 * @param y Atributo Y como parámetro
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Función que desplaza los puntos x distancia. Siendo la distancia tanto
	 * para el eje x como y parámetros de la función.
	 * @param dx Desplazamiento del eje X como parámetro
	 * @param dy Desplazamiento del eje Y como parámetro
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	
	/**
	 * Función que devuelve la distancia entre dos puntos.
	 * @param p Coge como atributo la propia clase. Es decir, se llama a sí misma.
	 * Con lo que tendríamos otras coordenadas aparte de la que ya definimos en la clase en sí.
	 * @return Devuelve la distancia entre las coordenadas.
	 */
	public int distancia(Punto p) {
		int distancia = 0;
		int aux1 = 0;
		int aux2 = 0;
		
		aux1 = this.x - p.x;
		aux2 = this.y - p.y;
		
		aux1 = (int) Math.pow(aux1, 2);
		aux2 = (int) Math.pow(aux2, 2);
		
		distancia = aux1 + aux2;
		distancia = (int) Math.sqrt(distancia);
		
		
		return distancia;
	}
}
